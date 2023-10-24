package chap11_abstraction.tv;

public class SamsungTv extends Tv{
	// 컨트롤 f눌러서 바꾸고 싶은 단어 지정하여 한 번에 바꾸기 가능.

	public SamsungTv() {
		super();
	}
	
	public SamsungTv(int lastchannel) {
		super(lastchannel);
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("제조사: 삼성 TV의 전원을 켭니다.");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("제조사: 삼성 TV의 전원을 끕니다.");

		
	}

	@Override
	public void operate(int channel) {
		// TODO Auto-generated method stub
		this.lastChannel = channel;
		moveTo(channel);
	}

	@Override
	public void moveTo(int channel) {
		// TODO Auto-generated method stub
		this.lastChannel = channel;
		
		System.out.println("제조사: 삼성 " + channel + "로 채널을 변경합니다");

		
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		this.lastChannel++;
		System.out.println("제조사: 삼성 채널을 올립니다.");
		
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		this.lastChannel--;
		System.out.println("제조사: 삼성 채널을 내립니다.");
	}


}
