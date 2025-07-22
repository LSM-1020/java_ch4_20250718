package ch04_02;

public class continuetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++) {
			if(i%2 == 0) {
				continue;
			} //continue는 뒤로 돌아가서 (i++로) 다시실행
			System.out.println(i);
		}
		
	}

}
