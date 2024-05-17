package chapter2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1 = 10;
		double d1 = 2.0;
		
		System.out.println((int)(i1+d1));
		System.out.println((int)(i1-d1));
		System.out.println((int)(i1*d1));
		System.out.println((int)(i1/d1));
		
		
		int age = 10;
		if(age <10) {
			System.out.println("당신의 나이는 10세 미만 입니다.");
		}
		else if(age==10) {
			System.out.println("당신의 나이는 10세 입니다.");
		}
		else {
			System.out.println("당신의 나이는 10세 초과 입니다.");
		}
		
		
	}
}
