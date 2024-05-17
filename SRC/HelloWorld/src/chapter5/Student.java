/**
 * 
 */
package chapter5;

/**
 * 
 */
//modifier 접근제어자 public
public class Student {

	/**클래스의 멤버 변수**/
	int studentID; //학번
	String studentName; //학생 이름
	int grade; //학년
	String address; //사는 곳
	final boolean isGlasses = false; //안경유무 final의 경우 기초 초기화 필요

	
	/**멤버 함수 --> 메소드(method) = function **/
	//void :return 받지 않는다
	public void showStudentInfo(/**매개변수, 인수, 파라미터(parameter)*/) { //학생의 정보를 표시
		System.out.println(studentName+", "+address);
	}
	
	public int getGrade(int studentID) {
		System.out.println("내가 받은 학번 :"+studentID);
		//학번 앞자리가 1로 시작하면 1학년
		//9로 시작하면 9학년
		grade = studentID/10;
		
		//this.grade
		//this : 위에 있는 멤버변수(grade) 접근
		
		System.out.println("당신의 학년은 :"+grade);
		
		return grade;
	}
	
	public static void main(String[] args) {
		
		//Student class 사용
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		//stu1
		stu1.studentName = "홍길동";
		stu1.address = "금천구";
		stu1.showStudentInfo();
		int grade1 = stu1.getGrade(34);
		System.out.println("다시한번더 출력 - 당신의 학년 :"+grade1);

		//stu2
		stu2.studentName = "전효진";
		stu2.address = "논현동";
		stu2.showStudentInfo();
		int grade2 = stu1.getGrade(27);
		System.out.println("다시한번더 출력 - 당신의 학년 :"+grade2);

	}
	
	
}//end class