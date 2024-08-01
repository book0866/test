package main;

public class Quiz6 {

	public static void main(String[] args) {
		
		// 아래 그림은 펜과 볼펜,만년필 클래스의 상속 관계를 표현한 것입니다.
		// 다음과 같이 클래스를 만들고, 볼펜과 만년필 인스턴스를 생성하세요.
		
		Pen ballPen = new BallPen(2, 100, "blue");
		Pen fountainPen = new FountainPen(3, 80, "Montblanc");

	}

}


class Pen {
	
	int thick;
	int rest;
	
	public Pen(int thick, int rest) {
		super();
		this.thick = thick;
		this.rest = rest;
	}

}


class BallPen extends Pen {
	
	String color;
	
	public BallPen(int thick, int rest, String color) {
		super(thick, rest);
		this.color = color;
	}
	
}


class FountainPen extends Pen {
	
	String brand;

	public FountainPen(int thick, int rest, String brand) {
		super(thick, rest);
		this.brand = brand;
	}
	
}












