package taller3.televisores;

public class TV {
	private Marca marca;
	private  int canal= 1;
	private int precio= 500;
	private boolean estado;
	private  int volumen= 1;
	private Control control;
	private static int numTV;
	public TV(Marca marca, boolean estado) {
		this.marca= marca;
		this.estado= estado;
	}

	public void setMarca(Marca marca) {
		this.marca= marca;
	}
	public void setCanal(int canal) {
		this.canal= canal;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public void setVolumen(int volumen) {
		this.volumen= volumen;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	public void setNumtv(int num) {
		numTV= num;
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
	public int getNumTV() {
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