
import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
     
	double temp;
	Scanner S = new Scanner(System.in);
	
	System.out.println("Introduce una temperatura. ");
	temp = S.nextDouble();
	
	if(temp > 30) {
		System.out.println("Hace calor.");
	}
	else if(temp > 25) {
		System.out.println("La temperatura es normal.");
	}
	else {
		System.out.println("Hace frio. ");
	}
	System.out.println("Estoy fuera. ");
	}

}
