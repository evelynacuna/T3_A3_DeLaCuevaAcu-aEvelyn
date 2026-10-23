
public class ImplementacionFilaEstatica implements RegistroImpresiones {
	
	Impresion filaEstatica[] = new Impresion [5];
	int posicion = 0;	//Sirve para actualizar los datos en la posicion en la que va 
	
	int sumaTotalHojas = 0;
	int bytesTotales = 0;
	
	@Override
	public void agregarImpresion(Impresion imp) {	

		if (posicion < filaEstatica.length) {	//Ingresa los datos de la imprecion si la cantidad de impreciones mandados por el usuario es menor al tamaño de la fila 
			filaEstatica[posicion] = imp;	//Guarda la imprecion en la posicion indicada por l variable Posicion
			posicion++;
			sumaTotalHojas+= imp.getCantHojas();
			bytesTotales+= imp.getTam();
				}
	}

	@Override
	public void imprimir() {
		if(posicion == 0) {
			System.out.println("No hay nada que imprimir");
		}else {
			Impresion primera = filaEstatica[0];	// Obtiene los datos de la primera impresion 
			System.out.println("\n----------------------");
			System.out.println("\nID: " + primera.getId());
			System.out.println("Tamaño: " + primera.getTam());
			System.out.println("Cantidad de hojas: " + primera.getCantHojas());
			
			for(int i =0; i<posicion-1; i++) {
				filaEstatica[i] = filaEstatica[i+1]; //Actualiza la fila despues de que sale el primero 
			}
			posicion--; //Para dejar los "turnos" libres 
		}
	}

	@Override
	public void mostrarTotalHojas() {
			System.out.println("\n--------------------------------------");
			System.out.println("La cantida de hojas es: "+ sumaTotalHojas + " hojas");
			System.out.println("--------------------------------------");
	}

	@Override
	public void mostrarTotalBytes() {
		
		System.out.println("\n----------------------------");
		System.out.println("Bytes totales: " + bytesTotales + " bytes");
		System.out.println("----------------------------");

	}

}
	