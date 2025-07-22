package ch04_02;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
//		for(int i=5;i<=10;i--) {
//			System.out.println("i값 :" + i);
//		}
		
		for(int i=5;i<=10;i--) {
			System.out.println("i값 :" + i);
			if(i == -1)
				break; // for문 while문 같은 반복문을 강제종료
			// print문 위에있으면 -1까지 찍고 break발동, 아래있으면 break발동먼저 하여 -1 출력되지않음
		}
		
		
	}

}
