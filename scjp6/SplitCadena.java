public class SplitCadena {
	public static void main (String [] args){
		String cadena = "1,2,3";
		String [] valores = cadena.split(",");
		for (int i = 0; i < valores.length; i++){
			System.out.println("El valor "+i+" es: "+ valores[i]);			
		}
	}
}