public class InversorReplacetor {
    //
    public static void main(String[] args) {
       String tf = "Test For";
       String cl = "Cool Look";
       InversorReplacetor inv = new InversorReplacetor();
       inv.inverseArray(tf.toCharArray());
       inv.inverseArray(cl.toCharArray());

    }
    
	public char customUpperCase(char aChar) {        
        if (97 <= aChar && aChar <= 122) {
            aChar = (char)( (aChar - 32) ); 
        }
        return aChar;        
    }   

    public void inverseArray(char [] anArray){
    	int sizeChar = anArray.length;
    	char [] invertedArray = new char[sizeChar];
    	for(int i = 0; i < anArray.length; i ++){
    		invertedArray[i] = customUpperCase(anArray[sizeChar - 1]);
			System.out.print(invertedArray[i]);
			sizeChar--;
    	}
    	System.out.printf("\n");
    }

}