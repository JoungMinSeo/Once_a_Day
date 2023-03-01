package March_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class March_01 {

	
	//	�� ���� X, Y�� ������ �ڸ����� �������� ��Ÿ���� ���� k(0 �� k �� 9)���� �̿��Ͽ� ���� �� �ִ� ���� ū ������ �� ���� ¦���̶� �մϴ�(��, �������� ��Ÿ���� ���� �� ���� ¦���� �� �ִ� ���ڸ� ����մϴ�). 
	//	X, Y�� ¦���� �������� ������, ¦���� -1�Դϴ�. X, Y�� ¦���� 0���θ� �����Ǿ� �ִٸ�, ¦���� 0�Դϴ�.
	//
	//	���� ���, X = 3403�̰� Y = 13203�̶��, X�� Y�� ¦���� X�� Y���� �������� ��Ÿ���� 3, 0, 3���� ���� �� �ִ� ���� ū ������ 330�Դϴ�. 
	//	�ٸ� ���÷� X = 5525�̰� Y = 1255�̸� X�� Y�� ¦���� X�� Y���� �������� ��Ÿ���� 2, 5, 5�� ���� �� �ִ� ���� ū ������ 552�Դϴ�(X���� 5�� 3��, Y���� 5�� 2�� ��Ÿ���Ƿ� ���� 5 �� ���� ¦ ���� �� �����ϴ�.)
	//	�� ���� X, Y�� �־����� ��, X, Y�� ¦���� return�ϴ� solution �Լ��� �ϼ����ּ���.
	
	public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<String, Integer>();
        Map<String, Integer> yMap = new HashMap<String, Integer>();
        
        List<String> list = new ArrayList<String>();
        
        for(String key: X.split("")) {
            xMap.put(key, xMap.getOrDefault(key, 0)+1);
        }
        
        for(String key: Y.split("")) {
            yMap.put(key, yMap.getOrDefault(key, 0)+1);
        }
        
        for(String key: xMap.keySet()) {
            if(!yMap.containsKey(key)) continue;
            
            int length = Math.min(xMap.get(key), yMap.get(key));
            for(int i = 0; i < length; i++) {
                list.add(key);
            }
        }
        
        String result = list.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.joining());
        
        if(result.isEmpty()) return "-1";
        if(result.replaceAll("0", "").isEmpty()) return "0";
        
        
        return result;
    }
	
	public static void main(String[] args) {
		
		March_01 m01 = new March_01();
		
		System.out.println(m01.solution("100", "2345"));
		
	}
	
	
}
