package chapter4;

public class Triangle {

	public static void main(String[] args) {

		int a=0;
		int b[];//배열변수만 선언
		b=new int [10]; //실제배열 할당(초기화)
		//"b"배열['index번호'] index값은 0부터 출발
		b[0]=1;
		b[1]=2;
		b[2]=3;
		long ll[]=new long[5];
		
		int[] studentIDs=new int[10];
		
		//( ).length 배열이 갯수 -> 배열을 돌릴때 공식 문법
		for(int i=0 ; i<b.length ; i++) {
			System.out.println("b["+i+"]값:"+b[i]);
		}
		
		//( ).length 배열이 갯수
		int c[]= {1,2,3}; //c 배열 초기화 및 값 세팅
		for(int i=0 ; i<c.length ; i++) {
			System.out.println("c["+i+"]값:"+c[i]);
		}
		
		

	}

}
