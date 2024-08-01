package main;

public class Quiz8 {

	public static void main(String[] args) {
		
		// 아래 그림은 계산기 인터페이스와 구현 클래스의 상속 관계를 표현한 것입니다.
		// 상속 관계와 결과를 참고하여 인터페이스와 클래스를 만드세요.
		// 곱하기 함수에서 곱하는 수가 0 또는 음수라면, 에러코드를 반환하고
		// 나누기함수에서 첫번째 숫자가 두번째 숫자보다 더 작다면, 에러코드를 반환하세요.
		
		Calc calc = new Calculator();
		System.out.println(Calc.add(10, 5));
		System.out.println(Calc.substract(10, 5));
		System.out.println(Calc.times(10, 5));
		System.out.println(Calc.divide(10, 5));
		
		System.out.println();
		System.out.println(Calc.times(10, 0));
		System.out.println(Calc.divide(10, 20));
		
		
	}

}


interface Calc {
	
	int ERROR = -9999;
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int substract(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int times(int n1, int n2) {
		
		if (n1 <= 0 || n2 <= 0) {
			return ERROR;
		} else {
			return n1 * n2;
		}
		
	}
	
	public static int divide(int n1, int n2) {
		
		if (n1 < n2) {
			return ERROR;
		} else {
			return n1 / n2;
		} 
		
	}
	
}


class Calculator implements Calc {
	
	
	
}




