/*
* 작성일 : 2024년 3월 29일 
 
* 작성자: 컴퓨터공학부 202395003 김경현
* 설명 : 두 정수를 입력받아 두 수가 모두 짝수이면 더한 결과를 출력하고,
* 		그렇지 않고 두 수중 하나라도 홀수이면 몇 번째 입력한 수를 짝수로
* 		입력해야 하는지 출력하시오.
* 
* 문제 분석 : 짝수는 2로 나눈 나머지가 0이다.
* 			홀수는 2로 나눈 나머지가 1이다. (0이 아니다)
* 
* 알고리즘 : 1. 두 수를 입력받는다.(num1 num2)
* 
* 			2. 만약 입력 받은 두 정수가 모두 짝수이면
* 				- 더한 결과를 출력
* 
* 			3. 만약 입력 받은 두 정수가 모두 홀수이라면
* 				- 두 정수 모두 홀수임으로 짟수로 입력해야 한다고 알려주는걸 출력하기
* 
* 			4. 아니면
* 				- 두 정수중 첫번쨰 정수가 홀수인지 확인하기
* 				- 두 정수중 두번째 정수가 홀수인지 확인하기
*/
package chapter04;

import java.util.Scanner;

public class SelectiveTest2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력 받는다.
		System.out.print("첫번째 정수를 입력하시오 : ");
		int num1 = stdIn.nextInt();
		
		// 1. 정수를 입력 받는다.
		System.out.print("두번째 정수를 입력하시오 : ");
		int num2 = stdIn.nextInt();
		
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println((num1 + num2));
		}
		
		if (num1 % 2 == 1 && num2 % 2 == 1) {
			System.out.println("첫번째 정수와 두번째 정수가 모두 홀수입니다. 짝수로 입력해주세요.");
		}
			
		else if (num1 % 2 == 1) {
			System.out.println("첫번째 정수가 홀수입니다. 짝수로 입력해주세요");
		}
		else {
			System.out.println("두번째 정수가 홀수입니다. 짝수로 입력해주세요");
			
		}


	}

}
