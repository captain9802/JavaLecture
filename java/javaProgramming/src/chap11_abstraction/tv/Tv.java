package chap11_abstraction.tv;

public abstract class Tv {
	

	public int lastChannel;
	
	// 추상 클래스의 생성자는 자식 클래스에서 사용 가능하다.
	public Tv() {
		lastChannel = 1;
	}
	
	public Tv(int lastchannel) {
		this.lastChannel = lastchannel;
		
	}
	// 추상 메소드 선언
	// 접근 제어자, abstract , 리턴타입 
	public abstract void powerOn();
	public abstract void powerOff();
	public abstract void operate(int channel);
	public abstract void moveTo(int channel);
	
	public void channelUp() {
		this.lastChannel++;
	}
	public void channelDown() {
		this.lastChannel--;
	}
	
	
	

}
