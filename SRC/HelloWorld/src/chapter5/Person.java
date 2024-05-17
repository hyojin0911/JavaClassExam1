package chapter5;

public class Person {

	int age;
	String name;
	int height;
	int weight;
	
	//생성자 : 원체 클래스 생성때 자동으로 생성된다
	//생성자와 class와 이름이 동일해야한다.
	//하기와같은 명려어는 생성사를 일부러 호출하여 생성자를 사용하기 위함
	//초기화 하기위해 사용
	public Person() {
		System.out.println("나는 생성자이다.");
	}
	
	public Person(int age, String name, int height, int weight) {
		this.age = age; //X: age = age
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
	}
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person(20, "홍길동", 185, 80);
		p1.showInfo();
		
		Person p2 = new Person();
		p2.showInfo();
		
		
		
	}
	
}
