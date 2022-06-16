import java.util.Scanner;

public class ListaAlumnos {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		String NombreCompleto = "" ;
		int Cantidad = 0;
		int numero = 0;
		int Promedio = 0;
		
		System.out.println("Ingrese la cantidad de estudiantes ");
		 
		 Cantidad = in.nextInt();
		 
		 Estudiante listEstudiantes[] = new Estudiante[Cantidad];
		 Estudiante listEstudiantesOrdenada[] = new Estudiante[Cantidad];
		 
		System.out.println("La cantidad de estudiantes es " + Cantidad);
		
			do {
				
				Estudiante estudiante = new Estudiante();
				
				System.out.println("Favor ingrese el nombre completo del estudiante # " + (numero + 1) );
			   
				NombreCompleto = in.nextLine();
			    
				estudiante.Nombre = NombreCompleto;
				
		        System.out.println("El nombre completo del estudiante # " + (numero+1) + " es " + estudiante.Nombre );
	
		        do {
		        	System.out.println(" ingrese el promedio ó nota obtenida por el o la estudiante # " + (numero+1) );
		    	    
		    	    Promedio = in.nextInt();
		    	    
		    	    if (Promedio < 11) {
		    	    	estudiante.Promedio = Promedio;
		    	    }
		    	      	     
		        	
		        }while( Promedio >= 11 ); //Promedio >=0 && Promedio<=10, 0>=10
		        
		        listEstudiantes[numero] = estudiante;
		        
			    numero++;
			}while(numero < Cantidad);
		
			
			listEstudiantesOrdenada = Ordenar(listEstudiantes);
			
			for (int i = 0; i < listEstudiantesOrdenada.length; i++) {
				
				if(listEstudiantesOrdenada[i].Promedio >= 7 && listEstudiantesOrdenada[i].Promedio <=10) {//Promedio >=7  && Promedio == 10 //7 <= Promedio
	    	    	System.out.println("El estudiante "+ listEstudiantesOrdenada[i].Nombre +" aprueba con un promedio de " + listEstudiantesOrdenada[i].Promedio);
	    	    } 
				else
	    	    {
	    	    	System.out.println("El estudiante " + listEstudiantesOrdenada[i].Nombre + " desaprueba con un promedio de " + listEstudiantesOrdenada[i].Promedio );	    	
	    	    }				
			}
			
			System.out.println("El estudiante con el promedio más alto fue "+ listEstudiantesOrdenada[0].Nombre +" con promedio de " + listEstudiantesOrdenada[0].Promedio);
			System.out.println("El estudiante con el promedio más alto bajo "+ listEstudiantesOrdenada[listEstudiantesOrdenada.length-1].Nombre +" con promedio de " + listEstudiantesOrdenada[listEstudiantesOrdenada.length-1].Promedio);
		}
	
	public static Estudiante[] Ordenar(Estudiante[] estudiantes)
	{			
		int i, j;
		Estudiante aux = new Estudiante();
		
        for (i = 0; i < estudiantes.length - 1; i++) {
        	
            for (j = 0; j < estudiantes.length - i - 1; j++) {   
            	
                if (estudiantes[j + 1].Promedio > estudiantes[j].Promedio ) {
                    aux = estudiantes[j + 1];
                    estudiantes[j + 1] = estudiantes[j];
                    estudiantes[j] = aux;
                }
            }
        }
		
		return estudiantes;
	}

}
