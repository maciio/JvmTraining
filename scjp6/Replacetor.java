public class Replacetor {
	public static void main(String[] args) {
		String x = "Test For Space";
		// String x = "Test%20For%20Space";
		new Replacetor().replaceSpaces(x.toCharArray());
	}

	public void replaceSpaces(char [] stringAsCharArray) {
    	int spaceCount = 0;
		int actualSize = stringAsCharArray.length, newLength = 0; 
		for(char c :stringAsCharArray){
			if(c == ' '){
				//System.out.println("vacio");
				spaceCount++;
			}
		}

		newLength = actualSize + (spaceCount * 2);
		char [] charResult = new char[newLength];
		
		for(int i = actualSize-1; i >= 0; i--) {
			if(stringAsCharArray[i] == ' ') {
				charResult[newLength -1] = '0';
				charResult[newLength -2] = '2';
				charResult[newLength - 3] = '%';
				newLength = newLength -3;
			} else {
				 charResult[newLength -1] = stringAsCharArray[i];		
				 newLength = newLength -1;
			}
			
		}
		//Just for print Test
		System.out.println(new String(charResult));
	}
}