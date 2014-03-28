package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("## Pascal's Triangle ##")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    println("## Balancing ##")
    println(balance("scala (in progress...)".toList))
    println(balance("(scala in progress...".toList))

    println("## countChange ##")
    println("combinaciones posibles: "+countChange(4, List(1, 2, 3)))

  }

  /**
   * Exercise 1
   */
  def pascal(col: Int, row: Int): Int = {
    if (col == 0 || row == col) 1
    else pascal(col - 1, row - 1) + pascal(col, row - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def evaluation(chars: List[Char], elementsBalance: Int): Boolean = {
      if (chars.isEmpty) {
        elementsBalance == 0
      } else {
        val balanceFound = {
          if (chars.head == '(') elementsBalance + 1
          else if (chars.head == ')') elementsBalance - 1
          else elementsBalance
        }
        evaluation(chars.tail, balanceFound)
      }
    }
    evaluation(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    val lastElem = coins.sorted.last
    partition(money, lastElem, "", 0, coins)
  }

  def partition(n: Int, max: Int, prefix: String, count: Int, coins: List[Int]): Int = {
    if (n == 0) {
      println(prefix)
      return 1
    }

    var rs = 0
    val minimus = min(n, max)
    for (x <- 1 to minimus) {
      if (coins.contains(x)) {
        rs += partition(n - x, x, prefix + " " + x, rs, coins)
      }
    }
    rs
  }

  def min(x: Int, y: Int) = {
    if (x < y) x
    else y
  }
}
