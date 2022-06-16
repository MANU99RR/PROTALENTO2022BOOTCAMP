package prueba;

public class Ejerciciociclos2 {

	public static void main(String[] args) { //1,99,2,98,3,97,4,96,5,95

	  int i = 1, j = 99;
	  
	  System.out.println("Serie con for: ");
	  for( i = 1; i <= 5; i++) {
	    if(1 < 5) {
          System.out.print(i + ", ");
          System.out.print(j + ", ");
	    } else {
	      System.out.print(i + ", ");
	      System.out.print(j);
	    }
	    j--;	
       }
	   System.out.println("");
	   
	   i = 1;
	   j = 99;
	   
	   System.out.println("Serie while: ");
	   while(i <= 5) {
	   if(i < 5 ) {
	     System.out.print(i + ", ");
	     System.out.print(j + ", ");
	   } else {
	     System.out.print(i + ", ");
	     System.out.print(j);
	   }
	     i++;
	     j--;
	   }
	   System.out.println("");
	   
	   i = 1;
	   j = 99;
	   
	   System.out.println("Serie do - while: ");
	   do{
	     if(i < 5) {
		   System.out.print(i + ", ");
		   System.out.print(j + ", ");
	     } else {
		   System.out.print(i + ", ");
		   System.out.print(j);
	     }
	     i++;
	     j--;
		}while(i <= 5);
	   
	  }
	}


