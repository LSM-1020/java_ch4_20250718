package ch04_01;

public class ifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 85;
		// if문은 조건이 여러개인건 사용x 조건문을 하나만 사용할수있기 때문
		// ex) 점수가 90이면 수 70이면 우를 출력하라는 안되고 점수가 90이면 수 를 출력하라는 됨
		// if안의 조건은 거짓이면 실행되지 않고 참일대만 실행됨
		// else를 추가하여 거짓일때 나타나는 코드를 생성
		if (score >=90) {
			System.out.println("수");
			
		}
		    System.out.println("입니다");
		


		// ex) 점수가 90이면 합격, 미만이면 불합격
		if (score >= 90)  {
			System.out.println("합격");
			
		}
		else {
			System.out.println("불합격");
		}
		
		    System.out.println("입니다");
}
}