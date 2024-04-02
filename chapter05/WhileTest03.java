/*
* 작성일 : 2024년 4월 2일
* 작성자: 컴퓨터공학부 202395003 김경현
* 설명 : 정수를 입력 받아 정수의 팩토리얼 값을 출력하시오.
* 
* 문제 분석 : 5! = 5 * 4 * 3 * 2 * 1 => 120 
* 			입력 받은 수부터 1까지 1씩 감소하면서
* 			곱셈을 한다.
* 			팩토리얼 = 팩토리얼 * 수
* 
* 알고리즘: 1.
*/
package chapter05;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력 받는다
		System.out.print("정수를 입력하시오 : ");
		int num = stdIn.nextInt();
		
		// 2. 곱하는 수는 받은 정수부터
		int pk = num;
		
		// 3. 곱하는 수를 받은 정수까지
		while(pk > 1) {
			// 1) 팩토리얼 출력
			num *= --pk;
		}
		System.out.println("입력받은 정수의 팩토리얼 값은 : " + num);

	}

}
