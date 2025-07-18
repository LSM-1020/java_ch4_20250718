package ch04_02;

public class forTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		int a = 0; //초기화 식 꼴
		// for괄호안이 false가 되면 반복이멈춤, 즉 거짓이 되기 전까지 실행될수있는 조건식을 만들어야함
		for(int i=0;i<5;i++) {// for(초기화;조건식;증감식)
			System.out.println("안녕하세요");
			System.out.println("i값:" + i );
		}
		
		
		//0~100사이의 짝수만 출력하시오.
		for(int i=0;i<=100;i=i+1) {
		
			System.out.println("i값 :" + i);
		}
		//0~100사이의 홀수만 출력하시오.
				for(int i=1;i<=100;i=i+2) {
				
					System.out.println("i값 :" + i);
				}
		//0~100 까지의 모든 수의 합을 구하시오.
				int total = 0;
				for(int i=1;i<=100;i++) {
				total += i; // total = total + i 누적식
					
				}
				System.out.println("total값:"+ total); // 최종값은 괄호 밖에서 출력 안에넣으면 전부다 나옴
	
		//1~100사이의 짝수만 출력하시오.
				for(int i=1;i<=100;i++) {
					if(i % 2 == 0) { // i를 2로나누었을때의 나머지가 0과 같은가
						System.out.println("i값 :" + i);
					}
				}
	
	
	}

}
