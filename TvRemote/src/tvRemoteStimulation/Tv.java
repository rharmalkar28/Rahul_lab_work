package tvRemoteStimulation;

public class Tv {
	private int volume = 5;
	private int chennel = 1;
	private boolean state = false;
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getChennel() {
		return chennel;
	}
	public void setChennel(int chennel) {
		this.chennel = chennel;
	}
	
	
	

}
