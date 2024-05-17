package chapter4;

public class Quiz2 {

	public static void main(String[] args) {
		
		int dan;
		int time;
		int guguRes;
		
		for (dan=1;dan<10;dan++) {
			for(time=1;time<10;time++) {
				if(dan%2==1) {
					continue;
				}
			guguRes=dan*time;
			System.out.println(dan+" * "+time+" = "+guguRes);
			}
		}
	}

}
