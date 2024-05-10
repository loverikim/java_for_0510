package java_ch04_0510;

public class WhileTest01 {

	public static void main(String[] args) {
		// while문 기본 구조 전역변수 초기값, while(조건식){반복해야할 구문}
		
		int i=1;
		while(i<=100) { //조건이 참이면 돌다가 거짓이면 멈춤
			// 무한루프에 빠질 수 있음 주의!
			// 보통 몇번 회전해야 할지 모를 때 사용. 아니면, 특정한 조건이 되면 멈추게 할 때 사용.
			// for은 일정한 반복횟수가 정해진 경우에 사용 for문을 주로 많이 사용함.
			System.out.println(i);
			i++; // i = i+1;			 
		}
		
		int j=1;
		while(true) {	// 무한루프
			j++;		
			System.out.println(j);
			if(j == 10000) {
				break;
			}
			
		}
		
		// do{}while()문		
		do { // 1번은 무조건 실행되고 그 다음에 조건에 따라 반복여부를 결정.
			 // 파이썬에는 없음. 요즘은 잘 안쓰는 do while문...
			System.out.println("안녕하세요!");
		}while(false);
		
		
		// continue 다음 단계로 넘어가지 않고 조건식으로 넘어감.		
		for(int k=1;k<=10;k++) {
			if(k%3==0) {
				continue;
			}
			System.out.println(k);
		}	
		
		
	}

}
