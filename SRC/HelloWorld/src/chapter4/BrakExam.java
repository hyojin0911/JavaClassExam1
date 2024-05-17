package chapter4;

public class BrakExam {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		
		for(num = 0; ;num++)/*조건문 없이 무한 루프*/ {
			sum += num;
			if(sum>= 100)
				break;
			
		}
		System.out.println("num :" +num);
		System.out.println("sum :"+sum);

	}

}
