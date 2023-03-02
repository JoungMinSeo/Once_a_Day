package February_2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// ���α׷��ӽ� - ���� ����� ���� ����
public class Febuary_28 {
	
	// ���ڿ� s�� �־����� ��, s�� �� ��ġ���� �ڽź��� �տ� �������鼭, �ڽŰ� ���� ����� ���� �ִ� ���� ���ڰ� ��� �ִ��� �˰� �ͽ��ϴ�.
	// ���� ���, s="banana"��� �� ��,  �� ���ڵ��� ���ʺ��� ���������� �о� �����鼭 ������ ���� ������ �� �ֽ��ϴ�.
    // 
	// b�� ó�� ���Ա� ������ �ڽ��� �տ� ���� ���ڰ� �����ϴ�. �̴� -1�� ǥ���մϴ�.
	// a�� ó�� ���Ա� ������ �ڽ��� �տ� ���� ���ڰ� �����ϴ�. �̴� -1�� ǥ���մϴ�.
	// n�� ó�� ���Ա� ������ �ڽ��� �տ� ���� ���ڰ� �����ϴ�. �̴� -1�� ǥ���մϴ�.
	// a�� �ڽź��� �� ĭ �տ� a�� �ֽ��ϴ�. �̴� 2�� ǥ���մϴ�.
	// n�� �ڽź��� �� ĭ �տ� n�� �ֽ��ϴ�. �̴� 2�� ǥ���մϴ�.
	// a�� �ڽź��� �� ĭ, �� ĭ �տ� a�� �ֽ��ϴ�. �� �� ����� ���� �� ĭ ���̰�, �̴� 2�� ǥ���մϴ�.
	// ���� ���� ������� [-1, -1, -1, 2, 2, 2]�� �˴ϴ�.
    // 
	// ���ڿ� s�� �־��� ��, ���� ���� ���ǵ� ������ �����ϴ� �Լ� solution�� �ϼ����ּ���.
	public int[] solution(String s) {
        
        String[] strArr = s.split("");
        Map<String, Integer> strMap = new HashMap<String, Integer>();
        int[] answer = new int[strArr.length];
        
        
        for(int i=0; i<strArr.length; i++){
            
            if(strMap.get(strArr[i]) == null){
                answer[i] = -1;
            }else {
                answer[i] = i - strMap.get(strArr[i]);
            }
            strMap.put(strArr[i], i);
        }
        
        return answer;
        
    }
	
	public static void main(String[] args) {
		Febuary_28 fe28 = new Febuary_28();
		
		System.out.println(Arrays.toString(fe28.solution("banana")));
		
	}
	
	
	
	
	
}
