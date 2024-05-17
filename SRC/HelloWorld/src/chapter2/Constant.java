package chapter2;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final은 상수 선언 -> 변수 변경 불가
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

		//MAX_NUM=1000;
		
	}

}
