package taller3.televisores;

public class Control {
	protected TV tv;
	public void turnOff() {
		tv.turnOff();
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int num) {
		tv.setCanal(num);
	}
	public void setVolumen(int num) {
		tv.setVolumen(num);
	}
	public void enlazar(TV tv) {
		this.tv= tv;
		tv.control= this;
	}
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv=tv;
		tv.control=this;
	}
}
