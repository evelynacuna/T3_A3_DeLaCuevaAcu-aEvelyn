import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImplementacionFilaDinamica implements RegistroImpresiones{
	Scanner sc = new Scanner (System.in);
	
	Queue<Impresion> ColaDinamica = new LinkedList<Impresion>();
	
	int sumaTotalHojas = 0;
	int bytesTotales = 0;
	

	@Override
	public void agregarImpresion(Impresion imp) {
		ColaDinamica.add(imp);	
		System.out.println("\n¡Impresion agregada!");
		System.out.println("------------------");
		bytesTotales+= imp.getTam();
	}

	@Override
	public void imprimir() {
		if(ColaDinamica.isEmpty()) {
			System.out.println("No se ha encontrado informacion");
		}else {
			Impresion imp1 = ColaDinamica.poll();
			sumaTotalHojas+= imp1.getCantHojas();
			System.out.println(imp1);
		
		}
	}

	@Override 
	public void mostrarTotalHojas() {
		System.out.println("Cantidad de hojas: " + sumaTotalHojas);
		
	}

	@Override
	public void mostrarTotalBytes() {
		System.out.println("Cantidad de bytes: " + bytesTotales);		
	}
	
	

}
