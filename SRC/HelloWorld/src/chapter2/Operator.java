package chapter2;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		int num1 = 0;
		System.out.println(num1++);

		int num2 = 10;
		int num3=num1+num2;
		System.out.println(num3);

		int num4 = (2 > 3) ? 1 : 0;
		if(num4==1) {
			System.out.println("참");
		}
		else{
			System.out.println("거짓");
		}
		
		int num5 = 10;
		num5 += num5;
		System.out.println(num5);
		
		
		Scanner sc = new Scanner(System.in);//입력을 받는 코드
		System.out.println("나이를 입력 하세요");
		
		int age1 = sc.nextInt();//입력받을때까지 커서가 깜빡이면서 대기하는 코드
//		int age = 20;
		int charge1 = 1000;
		int plus = 1000;
		
		if (age1 >= 20) {
			charge1 += plus;
		}
		if (age1 >= 40) {
			charge1 += plus;
		}
		if (age1 >= 65) {
			charge1 *= 0.2;
		}
		System.out.println("입장료 : "+charge1+" 원");
		
		
//		내코드
//		if(age1 < 20) {
//			System.out.println("입장료 : "+charge1+" 원");
//		}
//		else if(age1 <= 39){
//			int charge2 = charge1+1000;
//			System.out.println("입장료 : "+charge2+ " 원");
//		}
//		else if(age1 <= 59) {
//			int charge3 = charge1+2000;
//			System.out.println("입장료 : "+charge3+ " 원");
//		}
//		else if(age1 <= 64) {
//			int charge4 = charge1+3000;
//			System.out.println("입장료 : "+charge4+ " 원");
//		}
//		else{
//			double charge5 = (charge1+3000)*0.2;
//			System.out.println("입장료 : "+(int)charge5+" 원");
//		}
//		System.out.println("감사합니다");
		
	}
}
