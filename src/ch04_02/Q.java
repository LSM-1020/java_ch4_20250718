package ch04_02;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	for(int i=1;i<=4;i++) {		
		for(int j=1;j<=5;j++) {
			System.out.print("*");		
}
		System.out.println();		
	}	
	
	for(int i=1;i<=4;i++) {		
		for(int j=1;j<(i+1);j++) {
			// i값을 이용해서 j for문 값을 조정
			// 거짓을때 출력이 안되는걸 이용
			System.out.print("*");		
}
		
		System.out.println();
		
		System.out.println("-----------------------");
		
}	
	for(int i=1;i<=4;i++) {		
		for(int j=1;j<(6-i);j++) {
			
			System.out.print("*");		
          }
		
		System.out.println();
	}
	for(int i=4;i>0;i--) {		        // i는 총 4번을 돔 j는 i를 따라가는데, 4,3,2,1순으로 출력되야함
		                                // j=0일때 j<1 은 1번 j<2 는 2번 j<3은 3번 출력됨
		 								// 감소되는 수를 i로 놓고 감소되는 형식을 만들어줌 4번출력이니 4까지
		for(int j=0;j<i;j++) {
			
			System.out.print("*");		
          }
		
		System.out.println();
	}
	
}
}
