public class NumericReadability {
	public static void main(String[] args) {
		int n = 1_000;
		long debitCard = 1234_5678_9876_5432L;
		System.out.println("The card number is: " + debitCard);
		System.out.print("The formatted card number is:");
		printFormatted(debitCard);
		printFormatted(debitCard);
		float minAmount = 5_000F;
		float currentAmount = 5_250F;
		float withdrawalAmount = 500F;
		if ((currentAmount - withdrawalAmount) < minAmount) {
			System.out.println("Minimum amount limit exceeded " + minAmount);
		}
	}

	private static void printFormatted(long cardNumber) {
		String formattedNumber = Long.toString(cardNumber);
		System.out.println("toString(): " + formattedNumber);
		for (int i = 0; i < formattedNumber.length(); i++) {
			if (i % 4 == 0 && i != 0) {
				System.out.print(" ");
			}
			System.out.print(formattedNumber.charAt(i));
		}
		System.out.println();
	}
}