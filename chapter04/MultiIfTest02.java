/*
* 작성일 : 2024년 3월 19일 
* 작성자: 컴퓨터공학부 202395003 김경현
* 설명 : 단순 if문 실습.
* 		하나의 정수를 입력 받아 음수인지 확인하는 프로그램.
* 
* 문제 분석 : 90점 이상이면 A학점
* 			80점 이상이면 B학점
* 			70점 이상이면 C학점
* 			60점 이상이면 D학점
* 			60점 미만이면 F학점  
* 			점수는 정수로 입력 받는다.
* 
* 알고리즘 : 1. 점수(정수)를 입력받는다.
* 			2. 점수가 90점 이상인가?
* 				2-1. A학점입니다. 출력
* 
* 			3. 아니면 점수가 80점 이상인가?
* 				3-1. B학점입니다. 출력
* 
* 			4. 아니고 점수가 70점 이상인가?
* 				4-1. C학점입니다. 출력
* 
* 			5. 아니고 점수가 60점 이상인가?
* 				5-1. D학점입니다. 출력
* 			6. 아니면(나머지는)
* 				6-1. F학점입니다. 출력
*/
package chapter04;

import java.util.Scanner;

public class MultiIfTest02 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
	Scanner stdIn = new Scanner(System.in);
	
	// 1. 정수를 입력 받는다.
	System.out.print("정수 입력 : ");
	int num = stdIn.nextInt();
	
	if(num >= 90) {
		System.out.println("A학점입니다.");
	}
	else if(num > 100) {
		System.out.println("100점 이상이기에 학점을 계산할 수 없습니다");
	}
	else if(num >= 80 && num > 70) {
		System.out.println("B학점입니다.");
	}
	else if(num >= 70 && num > 60) {
		System.out.println("C학점입니다.");
	}
	else if(num >= 60) {
		System.out.println("D학점입니다.");
	}
	else if(num < 60 && num > 0) {
		System.out.println("F학점입니다.");
	}
	else if(num < 0) {
		System.out.println("입력된 점수값이 (-)이기에 계산 할 수 없습니다");
	}
	}

}
