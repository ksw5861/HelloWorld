package com.yedam.inheritance;

public class SmartPhone extends CellPhone {
	int channel;
	// 생성자.
	public SmartPhone() {}
	public SmartPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	//메소드.
	
	void watch() {
		System.out.println(channel + "번 채널을 시청합니다.");
	}
	// 부모클래스의 기능을 자식클래스 재정의(overriding) 오버라이딩..
	@Override
	public void powerOn() {
		System.out.println("🔴 Power On  🔴");
	}
	@Override
	public void powerOff() {
		System.out.println("⚪ Power Off ⚪");
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
