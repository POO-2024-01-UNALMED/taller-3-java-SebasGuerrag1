package taller3.televisores;

public class TV {
	//Atributos
	private Marca marca;
	private int canal= 1;
	private int precio= 500;
	private boolean estado;
	private int volumen= 1;
	protected Control control;
	private static int numTV;
	//Contrustor
	public TV(Marca marca, boolean estado) {
		this.marca= marca;
		this.estado= estado;
	}
	//Metodo get y set Numtv
	public static void setNumTV(int num) {
		TV.numTV= num;
	}
	public static int getNumTV() {
		return numTV;
	}
	//Metodo set y get marca
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public Marca getMarca() {
		return marca;
	}
	//metodo get y set precio
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPrecio() {
		return precio;
	}
	//Metedo get y set Estado
	public void setEstado(boolean estado) {
		this.estado=estado;
	}
	public boolean getEstado() {
		return estado;
	}
	//Metodo get y set canal
	public void setCanal(int canal) {
		if(estado && canal<120 && canal>0) {
			this.canal=canal;
		}
	}
	public int getCanal() {
		return canal;
	}
	//metodo get y set volumen
	public void setVolumen(int volumen) {
		if(estado && volumen<7 && volumen>0) {
			this.volumen=volumen;
		}
	}
	public int getVolumen() {
		return volumen;
	}
	// Metodo get y set Control
	public void setControl(Control control) {
		this.control= control;
		control.tv= this;
	}
	public Control getControl() {
		return control;
	}
	// METODO ENCENDER Y APAGAR TV
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	//Metodos de cambio de canal
	public void canalUp() {
		if(estado && canal<120 && canal>0) {
			canal +=1;
		}
	}
	public void canalDown() {
		if(estado && canal<120 && canal>0) {
			canal -=1;
		}
	}
	//metodo cambio de volumen
	public void volumenUp() {
		if(estado && volumen<7 && volumen>0) {
			volumen+=1;
		}
	}
	public void volumenDown() {
		if(estado && volumen<7 && volumen>0) {
			volumen-=1;
		}
	}
	
}
