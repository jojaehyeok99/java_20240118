package ch02;

// 캡슐화 : 멤버 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것 
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음

class FootballPlayerB {
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	FootballPlayerB(String name, String birth, String team, int goal) {
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	// getter 메서드
	// 필드(변수)의 값을 가져오는 메서드
	// 일반적으로 "get" 뒤에 필드이름을 붙여 메서드를 만듦
	// 예를들어, 필드이름이 "name"이라면, 해당 게터 메서드는 "getName"이 됨

	String getName() {
		return this.name;
	}
	
	String getBirth() {
		return this.birth;
	}
	
	String getTeam() {
		return this.team;
	}
	
	int getGoal() {
		return this.goal;
	}
	
	//--------------------------------------------------//
	
	// setter 메서드
	// 필드(변수)의 값을 설정하는 메서드
	// 일반적으로 "set" 뒤에 필드이름을 붙여 메서드를 만듦
	// 예를들어, 필드이름이 "name"이라면, 해당 세터 메서드는 "setName"이 됨
	
	void setName (String name) {
		this.name = name;
	}
	
	void setBirth (String birth) {
		this.birth = birth;
	}
	
	void setTeam (String team) {
		this.team = team;
	}
	
	void setGoal (int goal) {
		if (goal < 0) return;
		this.goal = goal;
	}

}

class FootballPlayerC{
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	FootballPlayerC(String name, String birth, String team, int goal) {
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}

	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getTeam() {
		return team;
	}
	void setTeam(String team) {
		this.team = team;
	}
	int getGoal() {
		return goal;
	}
	void setGoal(int goal) {
		this.goal = goal;
	}
	String getBirth() {
		return birth;
	}
	
}

public class E_Encapsulation {

	public static void main(String[] args) {
		
		FootballPlayerB son = new FootballPlayerB("손흥민", "920000", "토트넘 훗스퍼", 0);
//		son.name = "손흥민";
//		son.team = "토트넘 훗스퍼";
//		son.goal = 0;
		
		son.setGoal(-1);
		
		System.out.println(son.getName());
		System.out.println(son.getTeam());
		System.out.println(son.getGoal());
	}

}
