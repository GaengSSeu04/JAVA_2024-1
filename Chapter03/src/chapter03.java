/*
* 작성일 : 2024년 3월 15일
* 작성자: 컴퓨터공학부 202395003 김경현
* 설명 : 변수와 자료형
*/
public class chapter03 {

	public static void main(String[] args) {
		// 상수 선언
		final int MAX = 100;
		final double PI = 3.14;
		
		
		int r = 5; // 정수
		double pi = 3.14159;
		String name = "김경현";
		char blood = 'A';
		// System.out.println("AB형 아쉽게도 출력이 되지 않습니다");

		
		// 원주율 출력
		System.out.println("원주율은 " + PI + "입니다.");
		System.out.println("원주율은 " + pi + "입니다.");
		
		double area = r * r * pi;
		// 원의 넓이 계산하여 출력
		System.out.println("반지름이 " + r + "인 원의 넓이는 " + r * r);
		
		// 원의 넓이를 계산한다.
		area = r * r * PI;
		// 원의 넓이를 출력한다.
		System.out.println("반지름이 " + r +"인 원의 넓이는 " + area + "입니다.");

	}

}
