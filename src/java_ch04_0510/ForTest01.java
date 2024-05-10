package java_ch04_0510;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for str in [1,2,3,4,5]:
		// for i in rang(1,11): # 1~10까지 10번 for문이 반복		
		
		// int i; 예전방식, 요즘엔 변수선언과 동시에 값을 넣어서 많이 사용.
		for(int i=1;i<=10;i++) { // 초,조,증 보통 변수 i, j, k 를 많이 씀
			System.out.println(i);
		}
		
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		int sum = 0; // sum 정수변수를 선언과 동시에 0으로 초기화
		// 1~100까지 합을 출력하는 반복문을 작성하시오.
		for(int i=1;i<=100;i++) {
			sum = sum + i;			
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
//		int sum1 = 0;
//		//for 문을 이용, 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하시오
//		for(int j=1;j<=100;j*=3) {
//			sum1 = sum1 + j ;
//		}
//		System.out.println("1부터 100까지 중에서 3의 배수의 합 : " + sum1);
		
		int sum2 = 0;
		for(int i=3;i<=100;i=i+3) {
			sum2 = sum2 +i ;
		}
		System.out.println("1부터 100까지 중에서 3의 배수의 합 : " + sum2);
		
		int sum3 = 0;
		for(int i=1;i<=100;i++) {
			if(i % 3 == 0) {
				sum3 = sum3 + i;
			}
		}
		System.out.println("1부터 100까지 중에서 3의 배수의 합 : " + sum3);
	}

}
