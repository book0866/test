package main;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
	
		// 다음과 같이 학생 클래스(Student)를 만드세요.
		// 속성: 학번, 이름
		// 모든 멤버변수를 초기화하는 생성자
		// 학생의 정보를 반환하는 메소드
		// Student형 리스트를 생성하고 학생 3명을 추가하세요.
		// 그리고 리스트에 저장된 모든 학생정보를 출력하세요.
		
		ArrayList<Student> list = new ArrayList<>();
		
		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1002, "또치");
		Student student3 = new Student(1003, "도우너");
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		System.out.println(list.toString());
		
	}

}


class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "[studentID = " + studentID + "] , [studentName = " + studentName + "]";
	}
	
}



