package chapter4;

public class Triangle3 {

	public static void main(String[] args) {


		int row = 9;
		int col = row + (row -1);
		final int FIRST_COL_IDX = col / 2; //제일 처음 *(별) 이 찍힐 열 인덱스
		
		final int CENTER_ROW_IDX = row / 2; //전체 행 중에 가운데 행 인텍스
		
		String stars[][]=new String [row][col]; //문자열 저장 2차원 배열
		
		/*
		 * 배열 초기화 --> 모든 배열에 공백을 입력 해준다.
		 */
		for(int i=0 ; i<stars.length ; i++) {
			for(int j=0; j<stars[i].length; j++){
				stars[i][j] =" ";
				//열의 마지막 부분에는 개행 문자를 넣는다.
				if(j == stars[i].length-1) {
					stars[i][j] += "\n";
				}
			}
		}
		/*
		 * 배열에 별 입력
		 * 행의 갯수만큼 도는 for
		 */
		for(int i=0 ; i<stars.length ; i++) {
			//시작하는 열의 인덱스 번호를 추출한다.
			int colIdx = 0;
			int jCoutNum = 0;//열이 몇번 돌아야하는지에 대한 값을 가지고 있는 변수
			boolean isStartNewCol = true;
			
			//가운데 행까지만 별의 갯수가 증가한다.
			if(i<=CENTER_ROW_IDX) {
				//시작하는 열의 인덱스 번호를 추출한다.
				colIdx=FIRST_COL_IDX-i;
				jCoutNum=i;
			}
			//가운데 행부터 별의 갯수가 감소한다.
			else {
				colIdx=FIRST_COL_IDX-(FIRST_COL_IDX-i);
				jCoutNum=stars.length-(i+1);
			}
			
			//열의 갯수만큼 도는 for
			for(int j=0; j <= jCoutNum; j++) {
				if(!isStartNewCol) {
					colIdx += 2;
				}
				stars[i][colIdx] = "*";
				isStartNewCol = false;
			}
			
		}//end for
		
		/*
		 * 역배열
		 */
		
		
		
		
		/*
		 * 배열 값 출력
		 */
		for(int i=0 ; i<stars.length ; i++) {
			for(int j=0 ; j<stars[i].length ; j++) {
				System.out.print(stars[i][j]);
			}
		}

	}

}
