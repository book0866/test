package main;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 월에 따라 계절을 출력하는 프로그램을 구현하세요.
		// 3~5월 "현재 계절은 봄입니다."
		// 6~8월 "현재 계절은 여름입니다."
		// 9~11월 "현재 계절은 가을입니다."
		// 12월~2월 "현재 계절은 겨울입니다."
		// 이외는 “잘못된 값입니다. "
		
		int i = 13;
		
		if (i >= 3 && i <= 5) {
			System.out.println("현재 계절은 봄입니다.");
		} else if (i >= 6 && i <= 8) {
			System.out.println("현재 계절은 여름입니다.");
		} else if (i >= 9 && i <= 11) {
			System.out.println("현재 계절은 가을입니다.");
		} else if (i == 12 || i == 1 || i == 2) {
			System.out.println("현재 계절은 겨울입니다.");
		} else {
			System.out.println("잘못된 값입니다.");
		}
		
	}

}
