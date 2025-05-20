package com.yedam.member;

public class Member {
	// 필드.
	private String memberId;
	private String memberName;
	private String phone;
	private int point;
	// 생성자.
	public Member() {}
	public Member (String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	// 전체필드를 매개값으로 갖는 생성자.
	public  Member (String memberId, String memberName, String phone, int point) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
		this.point = point;
	}
	
	// 메소드(getter, setter)
	
	// 회원아이디의 get/set.
	String getMemberId() {
		return memberId;
	}
	
	void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	// 회원이름의 get/set.
	String getMemberName() {
		return memberName;
	}
	void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// 전화번호의 get/set.
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 포인트의 get/set.
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	//
	public void showInfo() {
		System.out.printf("이름은 %s, 연락처는 %s, 포인트는 %d\n", memberName, phone, point);
	}
	
}
