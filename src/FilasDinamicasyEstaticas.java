import java.util.Scanner;

public class FilasDinamicasyEstaticas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Menus m1 = new Menus();
		
		int opcion;
		do {
		System.out.println("\n======= MENU DE OPCIONES =======");
		System.out.println("1) Implementacion ESTATICA");
		System.out.println("2) Implementacion DINAMICA");
		System.out.print("Elije una opcion: ");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			
			m1.implementacionEstatica();
			
			break;
		
		case 2: 
			m1.implementacionDinamica();
			break; 
		
		}
		}while(opcion!=2);
		
	
	}

}
