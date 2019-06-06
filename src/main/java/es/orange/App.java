package es.orange;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int saldo = 0;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    
    public static int add(String entrada) {
    	int salida = 0;

    	String[] split ;
    	
    	if (entrada!= null &&entrada.length()>0) {
    		split = entrada.split(",");
    	}else {
    		split = new String[] {};
    	}
    	
    	
    	for(String a : split) {
    		salida = salida + Integer.valueOf(a);
    	}
    	
		return salida;
    	
    }
}
