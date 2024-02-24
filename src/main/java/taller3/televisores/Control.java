package taller3.televisores;

public class Control {
	protected TV tv;
	//enlazar
	public void enlazar(TV tv) {
		tv.setControl(this);
	}
	//control remoto turn on y off
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	//Control remoto volumen up y down
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	// control remoto canal
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	//control remoto sets
	public void setVolumen(int num) {
		tv.setVolumen(num);
	}
	public void setCanal(int num) {
		tv.setCanal(num);
	}
	public void setTv(TV tv) {
		this.tv= tv;
	}
	public TV getTv() {
		return tv;
	}
}
