package ch04_01;

public class ifTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주사위를 굴려서 3이나오면 한글로 '삼이 나왔습니다.'로 출력하는 프로그램
		// System.out.println((int) (Math.random()*6) + 1); 
		// Math.random은 0~1 사이 수중에서 소수점 16째 자리까지 가진 수를 랜덤으로 추출해주는 라이브러리
		// 괄호 확인
		//6을 곱하면 0~0.5999 까지 나옴, int로 정수변환을 해주고 +1을 해주면 1~6까지만 나옴
		

		int number = ((int) (Math.random()*6) + 1);	//1~6까지 랜덤으로 하나를 저장하는 매소드
		
			if (number == 1) { 
				System.out.println ("일이 나왔습니다.");
			}
			else if (number == 2) { 
				System.out.println ("이가 나왔습니다.");
			}
			else if (number == 3) { 
				System.out.println ("삼이 나왔습니다.");
			}
			else if (number == 4) { 
				System.out.println ("사가 나왔습니다.");
			}
			else if (number == 5) { 
				System.out.println ("오가 나왔습니다.");
			}
			else { 
				System.out.println ("육이 나왔습니다.");
			}
					
				
		
	}

}
