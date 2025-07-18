package ch04_01;

public class ifelseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ex) 점수가 90점 이상이면 수, 80점 이상이면 우, 70점 이상이면 미, 60점 이상이면 양, 60점 미만이면 가
		int score = 50;
		// 거짓이면 다음코드로 넘어가짐 따라서 두가지범위를 지정할 필요 없음
		if(score >= 90) {
			System.out.println("수");
			
		} else if (score >=80) {
			System.out.println("우");
		    }
		 else if (score >=70) {
			System.out.println("미");
			}
		 else if (score >=60) {
			System.out.println("양");
			}
		 else {
			System.out.println("가");
			}
		// 마지막은 무조건 "가"이기 때문에 조건을 지정해주지 않고 else만 써도 출력이 됨
		 System.out.println("입니다");
		 
		 // value 값이 10이상 20미만이면, 통과를 출력하시오.
		 int value = 15;
		 
		 if (value >= 10 && value < 20) {
			 System.out.println("통과");
		 }
		 
	}

}
