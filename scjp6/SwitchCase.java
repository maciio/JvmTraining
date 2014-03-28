public class SwitchCase {
	public static void main (String ... args) {
		int x = 0;
		int[] primes2 = {1,2,3,5};
		int[] primes = {2};
		for(int i: primes)
			switch(i) {
			    case 1: {x += i; System.out.println("1 - "+i);}
			    case 5: {x += i; System.out.println("5 - "+i);}
			    default: {x += i; System.out.println("default - "+i);}
			    case 2: {x += i; System.out.println("2 - "+i);}
			}
		System.out.println(x);
		System.out.println(1%2);
	}
}