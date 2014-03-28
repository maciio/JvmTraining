import java.math.BigDecimal;

public class CalcularMutuo {
	public static void main (String [] args) {
		BigDecimal monto = new BigDecimal(args[0]);
		BigDecimal resultado = calcularMutuo(monto);
		System.out.println("resultado: "+ resultado);
	}
	
	public static BigDecimal calcularMutuo(BigDecimal monto) {
			
        String cadena = monto.toString();
        System.out.println("cadena: " + cadena);
        int i = cadena.indexOf('.');
        System.out.println("indexOf: " + i);
        
        int parteEntera = monto.intValue();
        System.out.println("Partentero: "+ parteEntera);
        float parteFraccion = Float.parseFloat(cadena.substring(i));
        System.out.println("parteFraccion: "+ parteFraccion);
        int ultimoEntero = Integer.parseInt(cadena.substring((i - 1), i));
        System.out.println("ultimoEntero: "+ ultimoEntero);
        if (ultimoEntero < 5) {
            if (ultimoEntero < 3) {
                if (ultimoEntero == 2) {
                    if (parteFraccion >= 0.5F) {
                        parteEntera += (5 - ultimoEntero);
                    } else {
                        parteEntera -= ultimoEntero;
                    }
                } else {
                    parteEntera -= ultimoEntero;
                }
            } else {
                parteEntera += (5 - ultimoEntero);
            }
        } else {
            if (ultimoEntero < 8) {
                if (ultimoEntero == 7) {
                    if (parteFraccion >= 0.5F) {
                        parteEntera += (10 - ultimoEntero);
                    } else {
                        parteEntera -= (ultimoEntero - 5);
                    }
                } else {
                    parteEntera -= (ultimoEntero - 5);
                }
            } else {
                parteEntera += (10 - ultimoEntero);
            }
        }

        // String mutuoEntregado = parteEntera + ".00";
        // return new BigDecimal(mutuoEntregado);
        // String mutuoEntregado = parteEntera + ".00";
        return new BigDecimal(parteEntera).setScale(2);
	}	
}