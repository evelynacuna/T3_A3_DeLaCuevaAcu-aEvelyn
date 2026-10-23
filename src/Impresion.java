
public class Impresion {

	private int id;
	private int tam;
	private int cantHojas;
	
	//Consructor
	public Impresion(int id, int tam, int cantHojas) {
		this.id = id;
		this.tam = tam;
		this.cantHojas = cantHojas;
	}
	
	//Getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getCantHojas() {
		return cantHojas;
	}

	public void setCantHojas(int cantHojas) {
		this.cantHojas = cantHojas;
	}

	@Override
	public String toString() {
		return "ID: " + id
				+ "\nCantidad de Hojas: " + cantHojas
				+ "\nTamaño de bytes: " + tam;
	}
	
	 
	
}
