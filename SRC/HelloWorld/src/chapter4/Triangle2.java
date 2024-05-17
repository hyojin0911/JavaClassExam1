package chapter4;


/**
 * 클래스의 주석 : 해당 클래스가 어떤 일을 하는건지를 요약하는 주석
 * 2차원 배열을 만들기 위한 클래스
 * @author JEON
 * @since 2024.05.14
 * @version 1.0
 */
public class Triangle2 {

	public static void main(String[] args) {
		
		//1차원 배열
		
		//2차원 배열			행  열
		//				   row col
		int cc[][]=new int [3][3];
		
		cc[0][2]=100;
		cc[1][1]=200;
		cc[2][0]=300;
		
		for(int i=0 ; i<cc.length ; i++) { //행의 갯수만큼
			
			for(int j=0 ; j<cc[i].length ; j++ ) { //열의 갯수만큼
				System.out.println("cc["+i+"]["+j+"] => "+cc[i][j]);
			}
		}
		
	}

}
