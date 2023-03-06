package March_2022;

public class March_06 {

//	함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
//	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
//	x는 -10000000 이상, 10000000 이하인 정수입니다.
//	n은 1000 이하인 자연수입니다.
	public long[] solution(int x, int n) {
		
		long[] answer = new long[n];
		int num = x; // x의 초기값 및 for문 돌면서 x만큼 + 될 변수 선언
		
		for (int i = 0; i < n; i++) {
			answer[i] = num;
			num += x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		March_06 m06 = new March_06();
		m06.solution(2, 5);
	}
}
