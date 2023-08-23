package collection;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		
		System.out.println("총 학생 수:"+map.size());
		
		System.out.println("유재석의 점수:"+map.get("유재석"));
		
		if(map.containsKey("서장훈")) {
			int point = map.get("서장훈");
			map.put("서장훈", ++point);
			System.out.println("서장훈의 점수: " +map.get("서장훈"));
		}
		else {
			map.put("서장훈", 1);
			System.out.println("새로 들어온 서장훈 점수 1");
			
		}
		
		map.remove("유재석", 15);
		System.out.println(map.get("유재석"));
		
		for(String key: map.keySet()) {
			System.out.println(key);
		}
		for(int value: map.values()) {
			System.out.println(value);
		}
		for(String key: map.keySet()) {
			System.out.println("학생이름 :"+key+"포인트:"+map.get(key));
			
		}
		// TODO Auto-generated method stub

	}

}
