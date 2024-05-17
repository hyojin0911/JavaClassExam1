package chapter4;

public class Bubble {

	public static void main(String[] args) {


		int data[]= {2,9,10,3,7,15,5};
		
		System.out.println("원래 데이터");
		
		for(int i=0 ; i<data.length ; i++) {
			System.out.print(data[i]+", ");
		}
		
		System.out.println(" ");

		int dLen=data.length;
		
		for(int i=1 ; i<dLen ; i++) {   //length-1 의미는 마지막 피벗은 비교할 필요가 없다.
										//마지막은 오른쪽으로 비교할 대상이 없으므로 for문을 불필요하게 돌릴 필요가 없다.
			
			//피벗 값으로 오른쪽 계속 비교해주는 for문
			for(int j=0 ; j<(dLen-i); j++) {
				
				//왼쪽의 값이 오른쪽 값보다 크냐?
				if(data[j]>data[j+1]) {
					//왼쪽값이 작아야한다. 작은순서로 정렬할것이기 때문.
					int k = data[j]; //swap 알고리즘 - 현재 왼쪽값을 임시변수 k에 저장.
					data[j]=data[j+1]; //오른쪽에 값을 왼쪽 자리에 저장.
					data[j+1]=k;//오른쪽자리에 왼쪽값저장된 임시변수 k의 값을 저장.
				}
			}
		}//end for
		System.out.println("버블 소팅 한후");
		for(int i=0 ; i<data.length ; i++) {
			System.out.print(data[i]+", ");
		}
	}//end main
}//end class
