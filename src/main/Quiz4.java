package main;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 다음과 같이 함수를 만드세요.
		// 정수형 배열을 입력 받아 합계를 구하고 반환하세요.
		// 단, 배열의 크기가 3보다 작으면, -999을 반환하고 함수를 종료하세요.
		
		// 메인함수에서 5개 크기의 정수형 배열을 생성하세요.
		// 값의 목록을 다음과 같이 초기화하세요.
		// {2, 4, 6, 8, 10}

		int[] arr1 = {2, 4, 6, 8, 10};
		
		int sum = 0;
		
		for (int i = 0; i <= arr1.length; i++) {
			
			sum = sum + arr1.length;
			
		}
		
		System.out.println("첫 번째 배열의 합계: " + sum);
		
		
		
		// 배열을 전달하여 함수를 호출하고 결과를 출력하세요.
		// 그리고 2개 크기의 정수형 배열을 생성하세요.
		// 값의 목록을 다음과 같이 초기화하세요.
		// {2, 4}
		// 배열을 전달하여 함수를 호출하고 결과를 출력하세요.
		
		int[] arr2 = {2, 4};
		
		for (int i = 0; i <= arr2.length; i++) {
			sum = sum + arr1.length;
		} if (arr2.length < 3) {
			int error = -999;
			System.out.println("두 번째 배열의 합계: " + error);
		}
		
	}

}



