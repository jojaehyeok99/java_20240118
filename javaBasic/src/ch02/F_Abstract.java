package ch02;

// 추상 클래스 : 추상 메서드를 포함할 수 있는 클래스
// 추상 클래스 자체로 인스턴스를 생성할 수 없음, 반드시 추상클래스를 상속한 하위클래스로 인스턴스 생성해야 함
// 문법 : abstract class 추상클래스명 {}

// 추상 메서드 : 선언부만 존재하고 구현부는 존재하지 않는 메서드
// 반드시 추상 클래스를 상속받은 하위클래스에서 오버라이딩 해서 구현해야함
// 문법 : abstract 반환타입 추상메서드명 (매개변수);

// Player
// 이름 : 문자열
// 종족 : 문자열
// 성별 : 문자열
// 경험치 : 정수

// 대화 - 입력 : (메세지 - 문자열) / 출력 : void
// 사냥 - 입력 : (수치 - 정수) / 출력 : void (경험치 - 정수)

abstract class Player {
	String name;
	String species;
	String gender;
	double experience;
	
	// 추상클래스에서도 생성자를 만들 수는 있지만 
	// 하위클래스에서 호출하는 용도로만 사용
	Player(String name, String species, String gender, double experience) {
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.experience = experience;
	}
	
	// 반드시 모든 캐릭터가 메세지를 똑같이 구현
	final void chat (String message) {
		System.out.println(this.name + ": " + message);
	}
	
	// 반드시 나중에 기능 구현
	abstract double hunt (int figure);
}

class Dealer extends Player { //컴파일 에러가 뜨는 이유 : 반드시 기능 구현을 해줘야 되기 때문
	
	Dealer(String name, String species, String gender, double experience) {
		super(name, species, gender, experience);
	}
	
	double hunt(int figure) {
		System.out.println(figure + "만큼의 공격을 했습니다.");
		this.experience += (figure * 0.8);
		return this.experience;
	}
}

class Tanker extends Player {
	
	Tanker(String name, String species, String gender, double experience) {
		super(name, species, gender, experience);
	}

	@Override
	double hunt(int figure) {
		return 0;
	}
}

public class F_Abstract {

	public static void main(String[] args) {
		
		// 추상 클래스는 인스턴스를 생성할 수 없음
		// Player player = new Player("이름", "인간", "남", 0); 
		// 반드시 추상 클래스를 상속하여 구현한 하위 클래스로 인스턴스를 생성
		
		Dealer dealer = new Dealer("이름", "인간", "남", 0);
		

	}

}
