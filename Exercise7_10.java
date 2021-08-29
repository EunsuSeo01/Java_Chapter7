/**
 * 
 * @author user EunSu Seo
 * last modified 2021-08-29
 */
class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;		// 클래스 외부에서 접근할 수 없도록 private를 붙임.
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public boolean getIsPowerOn() { return isPowerOn; }
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() { return channel; }
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() { return volume; }
}
public class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}
}
