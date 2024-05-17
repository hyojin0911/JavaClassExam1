package chapter4;

public class Quiz4 {

	public static void main(String[] args) {

		int LOOP_NUM = 4;
		int i;//행
		int j;//열
		int num=1;
		int num2=7;
		char star;

		for(i = 1 ; i <= LOOP_NUM ; i++) {
			star = '★';
			for(int k = LOOP_NUM; k > i; k--) {
				System.out.print(" ");
			}
			for(j = 0 ; j<num; j++) {
				System.out.print(star);
			}
			num = num +2;
		System.out.println();
		}
		
		for(i = 0; i <= LOOP_NUM-1;i++) {
			star='☆';
			for(int k = 0; k <i; k++) {
				System.out.print(" ");
			}
			for(j=num2; j>0;j--) {
				System.out.print("☆");
			}
			num2=num2-2;
			System.out.println();
		}
		
	}

}