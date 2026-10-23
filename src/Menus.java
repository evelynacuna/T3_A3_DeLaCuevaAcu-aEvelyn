import java.util.Scanner;

public class Menus {
	Scanner sc = new Scanner(System.in);
	
	ImplementacionFilaEstatica ce1 = new ImplementacionFilaEstatica();
	Impresion imp1 = new Impresion(1, 263,15);
	Impresion imp2 = new Impresion(2, 524,28);
	Impresion imp3 = new Impresion(3, 152,8);
	
	public void implementacionEstatica() {
	
	int opcion;
	
	do {
		System.out.println("\n~~~~~ IMPLEMENTACION ESTATICA ~~~~~");
		System.out.println("1) Agregar impresiones");
		System.out.println("2) Imprimir");
		System.out.println("3) Mostrar Total de Hojas");
		System.out.println("4) Mostrar total de Bytes");
		System.out.println("5) Volver al menu principal");
		System.out.print("Elije una opcion: ");
		opcion = sc.nextInt();
		
		switch(opcion) {
			
		case 1: 
			ce1.agregarImpresion(imp1);
			ce1.agregarImpresion(imp2);
			ce1.agregarImpresion(imp3);
			
			System.out.println("\n-----------------------------");
			System.out.println("Se han agregado las impresiones");
			System.out.println("-------------------------------");
			break;
			
		case 2: 
			
			System.out.println("\nImprimiendo documentos...");
			ce1.imprimir();
			ce1.imprimir();
			ce1.imprimir();
			
			break;
			
		case 3: 
			ce1.mostrarTotalHojas();			
			break;
			
		case 4:
			ce1.mostrarTotalBytes();			
			break;
			
		case 5:
			System.out.println("\nVolviendo al menu principal....");
			break;
			
			default:
				System.out.println("Opcion no valida. Intenta otra vez!");
		}
	}while (opcion != 5);

}
	
	public void implementacionDinamica() {
		
		int opcion1;
		
		ImplementacionFilaDinamica fd1 = new ImplementacionFilaDinamica();

		do {
			System.out.println("\n~~~~~ IMPLEMENTACIONES DINAMICA ~~~~~");
			System.out.println("1) Agregar Impresiones");
			System.out.println("2) Imprimir");
			System.out.println("3) Mostrar Total de Hojas ");
			System.out.println("4) Mostrar Total de bytes");
			System.out.println("5) Volver al menu principal");
			System.out.print("Elije una opcion ");
			opcion1 = sc.nextInt();
			
			switch (opcion1) {
			
			case 1: 
				
				System.out.println("\nAgregando impresiones....");
				System.out.println("\n--------------------------------");
				System.out.print("Ingresa la cantidad de impresiones: ");
				int impresiones = sc.nextInt();

				int id = 1;
				for (int i = 0; i < impresiones; i++) {
					System.out.print("\nIngrese la cantidad de hojas: "); // Asigno la cantidad de hojas
					int cant = sc.nextInt();
					System.out.print("Ingresa el tamaño del archivo (bytes): "); // Asigno la cantidad de bytes
					int cantByte = sc.nextInt();

					Impresion first = new Impresion(id, cantByte, cant); // Creo el objeto con la informacion
					id++;

					fd1.agregarImpresion(first);
				}
				break;
				
			case 2: 
				fd1.imprimir();
				
				break;
				
			case 3:
				break;
				
			case 4: 
				break;
				
			case 5:
				System.out.println("\nVolviendo al menu principal...");
				break;
				
			default:
				System.out.println("Opcion no valida. Intenta otra vez!");
			}
			
			
		}while(opcion1 != 5);
		
	}
}
