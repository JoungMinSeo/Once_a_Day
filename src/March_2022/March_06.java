package March_2022;

public class March_06 {

//	�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
//	���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
//	x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
//	n�� 1000 ������ �ڿ����Դϴ�.
	public long[] solution(int x, int n) {
		
		long[] answer = new long[n];
		int num = x; // x�� �ʱⰪ �� for�� ���鼭 x��ŭ + �� ���� ����
		
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
