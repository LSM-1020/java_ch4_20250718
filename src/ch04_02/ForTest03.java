package ch04_02;

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++) {
			System.out.println("안녕하세요");		
			for(int j=1;j<=5;j++) {
				System.out.println("반갑습니다");		
				// 안녕하세요가 1번 실행될때 반갑습니다 5번 실행됨, 안반반반반반/안반반반반반 식으로 실행
				for(int k=1;k<=3;k++) {
					System.out.println("감사합니다");		
					//안반감감감/반감감감/반감감감 으로 실행
					
				}
			}
		
		}
//		for(int i=1;i<=5;i++) {
//			System.out.println("*");				
//		}
		
		for(int i=1;i<=4;i++) {		
			for(int j=1;j<=5;j++) {
				System.out.print("*");		
	}
			System.out.println();		
		}	
		
	}

}
