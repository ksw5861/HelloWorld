package com.yedam.board;
/*
 * User: 아이디, 비밀번호, 이름.
 */
class User{
	private String userId;
	private String passwd;
	private String userName;
	
	// 생성자. 전체필드를 매개값으로 가지는.
	public User(String userId, String passwd, String userName) {
//		super();
		this.userId = userId;
		this.passwd = passwd;
		this.userName = userName;
	}
	
	// getter
	public String getUserId() {
		return userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getUserName() {
		return userName;
	}
	
}

public class UserExe {	
	static User[] users = {
			new User("holy", "1111", "김영광") //
			, new User("cutie", "2222", "홍예쁨") //
			, new User("guest", "3333", "밤손님") //
	};
	
	// 아이디, 비밀번호 => 
	static boolean login(String uname, String passwd) {
		// code HERE.
		
		for(int i = 0; i < users.length; i++) {
			if(uname.equals(users[i].getUserId()) && passwd.equals(users[i].getPasswd())) {
				System.out.printf("로그인 성공! 환영합니다 %s 회원님\n", users[i].getUserName());
				return true;
			}
		}
		return false;
	}
}

