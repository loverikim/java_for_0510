package java_ch04_0510;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이중 for문 중첩 for문
	
		for(int i=0;i<5;i++) { // i=0 1 2 3 4 --> 5번 반복 for문
			for(int j=0;j<2;j++) { // j=0 1 --> 2번 반복 for문
				System.out.println("안녕!");
			}
		}	
		// 구구단 2~9단을 출력하는 이중 for문을 작성하시오.
		
		for(int i=2;i<10;i++) {	// i = 2,3,4,5,6,7,8,9			
			for(int j=1;j<10;j++) {// j= 1,2,3,4,5,6,7,8,9
				System.out.println(i+"X"+j+"="+(i*j));	
			}			
			System.out.println("========");
		}
		
		// 이중 for문 별찍기
		for(int i=1;i<6;i++) {	
			for(int j=1;j<=i;j++) {				
				System.out.print('*');	
			}	
			System.out.print('\n');
		}
			
			
		
			
		}

	}
		
