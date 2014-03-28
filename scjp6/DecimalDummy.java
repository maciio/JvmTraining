import java.math.BigDecimal;

public class DecimalDummy{
	public static void main (String... args){
		double db = 0.1234567890;

		System.out.print(" Double = "+ db );
		BigDecimal big = new BigDecimal( db );
		System.out.print(" big = "+big);
		System.out.print(" rounded big = "+big.setScale (2,
		BigDecimal.ROUND_UP ));
		System.out.println(" back to double = " + new Double(
		big.doubleValue() ));
	}
}
