package ch04_01;

public class switchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = ((int) (Math.random()*6)+1);
		// switch (변수이름) {}
		switch (number) {
			case 1:
				System.out.println ("1이 나왔습니다.");
				System.out.println ("11111");
				break;
			case 2:
				System.out.println ("2가 나왔습니다.");
				System.out.println ("22222");
				break;
			case 3:
				System.out.println ("3이 나왔습니다.");
				System.out.println ("33333");
				break;
			case 4:
				System.out.println ("4가 나왔습니다.");
				System.out.println ("44444");
				break;
			case 5:
				System.out.println ("5가 나왔습니다.");
				System.out.println ("55555");
				break;
			case 6: 
				System.out.println ("6이 나왔습니다.");
				System.out.println ("66666");
				break;
			default : // 모든 case에 해당되지 않으면 default로 적용됨
				System.out.println ("주사위에서 나올수 없는 숫자가 입력되었습니다.");
					
		}
		
	}

}
