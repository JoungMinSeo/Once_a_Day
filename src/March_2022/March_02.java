package March_2022;

public class March_02 {

	
	//	������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
	public double solution(int[] arr) {
		double answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		
		answer = answer / arr.length;
		
		return answer;
	}
	
	public static void main(String[] args) {
		March_02 m01 = new March_02();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println(m01.solution(arr));
		
	}
	
	
}
