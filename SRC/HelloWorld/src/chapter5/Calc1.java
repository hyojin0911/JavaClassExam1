package chapter5;

public class Calc1 {

	int num1;
	int num2;
	int result;
	
	public int add(int num1, int num2) {
		
		result = num1+num2;
		System.out.println(num1+num2);
		return result;
		
	}
	
	public int minus(int num1, int num2) {
		
		result = num1-num2;
		System.out.println(num1-num2);		
		return result;
		
	}
	
	public int multiple(int num1, int num2) {
		
		result = num1*num2;
		System.out.println(num1*num2);
		return result;
		
	}
	
	public int devide(int num1, int num2) {
		
		result = num1/num2;
		System.out.println(num1/num2);
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Calc1 cal1 = new Calc1();
		
		//add 함수를 호출 했을때 a, b 인수 더한값을 출력
		cal1.add(10,20);
		
		//add 함수를 호출 했을때 a, b 인수 뺀값을 출력
		cal1.minus(10,20);
		
		//add 함수를 호출 했을때 a, b 인수 곱셈값을 출력
		cal1.multiple(10,20);
		
		//add 함수를 호출 했을때 a, b 인수 나눈값을 출력
		cal1.devide(10,20);		

	}

}
