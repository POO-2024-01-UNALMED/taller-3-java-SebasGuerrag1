package taller3.televisores;

public class TV {
	private Marca marca;
	private  int canal= 1;
	private int precio= 500;
	private boolean estado;
	private  int volumen= 1;
	protected Control control;
	private static int numTV;
	public TV(Marca marca, boolean estado) {
		this.marca= marca;
		this.estado= estado;
	}
	public static int getNumTV(){
		return numTV;
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setVolumen(int volumen) {
		if(volumen<7 &&volumen>0 && estado) {
			this.volumen=volumen;
		}
	}
	public int getVolumen() {
		return volumen; 
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setCanal(int canal) {
		if(canal<120 && canal>0 && estado) {
			this.canal=canal;
		}
	}
	public int getCanal() {
		return canal;
	}

	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado=estado;
	}
	public void setControl(Control control) {
		this.control=control;
		control.tv= this;
	}
	public Control getControl() {
		return control;
	}
	public void canalUp(){
		if (estado){
			canal = (canal < 120)? canal+1 : canal;}
	}
	public void canalDown(){if (estado) {
		canal = (1 < canal)? canal-1 : canal;}
	}
	public void volumenUp(){if (estado) {volumen = (volumen < 7)? volumen+1 : volumen;}}
	public void volumenDown(){if (estado) {volumen = (0 < volumen)? volumen-1 : volumen;}}
}
