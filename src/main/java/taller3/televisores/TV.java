package taller3.televisores;

public class TV {
	private Marca marca;
	private  int canal= 1;
	private int precio= 500;
	private boolean estado;
	private  int volumen= 1;
	protected Control control;
	protected static int numTV;
	public TV(Marca marca, boolean estado) {
		this.marca= marca;
		this.estado= estado;
	}

	public void setMarca(Marca marca) {
		this.marca= marca;
	}
	public void setCanal(int canal) {
		if(0< canal && canal<=120 && estado==true) {
			this.canal= canal;
		}
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public void setVolumen(int volumen) {
		if(estado) {
			if(volumen<7 && volumen>0) {
				this.volumen= volumen;
			}
		}
	}
	public void setControl(Control control) {
		this.control=control;
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}	
	public Marca getMarca() {
		return marca;
	}
	public int getCanal() {
		return canal;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public Control getControl() {
		return control;
	}
	public static int getNumTV(){
		return numTV;
	}
	public void turnOn() {
		estado= true;
	}
	public void turnOff() {
		estado= false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if(canal<120 && estado==true) {
			canal++;
		}
	}
	public void canalDown() {
		if(canal>1 && estado==true) {
			canal--;
		}
	}
	public void volumenUp() {
		if(volumen<7 && estado==true) {
			volumen++;
		}
	}
	public void volumenDown() {
		if(volumen>0 && estado==true) {
			volumen--;
		}
	}
	
}
