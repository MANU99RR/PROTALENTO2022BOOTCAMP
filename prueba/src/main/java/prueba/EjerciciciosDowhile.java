 package prueba;

public class EjerciciciosDowhile {

	public static void main(String[] args) {

		int i = 0;
		
		System.out.println("Serie con for: ");
		for( i = 1; i <=10; i++ ) {
		  if(i<10) {
			System.out.print(i + ", ");	
			} else {
			 System.out.print(i);	
			}	
		}
	    i = 1;
	    System.out.println(""); //Para que haga un salto de linea e imprima todo lo que esta antes
	   
	    System.out.println("Serie con While: "); 
	    while(i <= 10) { //while unicamente trabaja a base de condiciones
	      if(i < 10) {
	    	System.out.print( i + ", ");  
	      } else {
	    	System.out.print( i );  
	      }
	      i++;
	    }
	    i = 1;
	    System.out.println("");
	    
	    System.out.println("Serie con Do while ");
	    do {
	    if(i < 10) {
	    System.out.print(i + ", ");	
	    } else {
	    System.out.print(i);	
	    }
	    i++;
	     }while(i <= 10);
	}
}
