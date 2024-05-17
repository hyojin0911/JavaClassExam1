package chapter4;

public class WhileExam1 {

	public static void main(String[] args) {

		final int LOOP_NUM = 100;
		int num = 1;
		int sum2 = 0;
		int sum3 = 0;

		while(num <= LOOP_NUM /*무한루프 조심*/) {
			if(num%2 == 0) {//2로 나눈 나머지가 0이면 짝수
				sum2 += num;	
			}
			else{
				sum3 += num;
			}
			num++;//증가 안하면 무한루프가 됨
			//System.out.println("무한");
		}//end if
		System.out.println("1부터 "+LOOP_NUM+"까지 짝수합 : "+sum2);
		System.out.println("1부터 "+LOOP_NUM+"까지 짝수합 : "+sum3);

		int num1 = 1;
		long sum1 = 1;
		
		while(num1 <= 10) {
			sum1 *= num1;
			num1++;
		}
		System.out.println("1부터 10까지 곱 : "+sum1);
	}//end main

}//end class
