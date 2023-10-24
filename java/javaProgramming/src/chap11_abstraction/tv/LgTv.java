package chap11_abstraction.tv;

public class LgTv extends Tv {
	
	public LgTv() {
		super();
	}
	
	public LgTv(int lastchannel) {
		super(lastchannel);
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("제조사: 엘지 TV의 전원을 켭니다.");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("제조사: 엘지 TV의 전원을 끕니다.");

		
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
		
		System.out.println("제조사: 엘지 " + channel + "로 채널을 변경합니다");

		
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		this.lastChannel++;
//		super.channelUp(); 도 가능하다.
		System.out.println("제조사: 엘지 채널을 올립니다.");
		
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		this.lastChannel--;
//		super.channelDown();
		System.out.println("제조사: 엘지 채널을 내립니다.");
	}

}
