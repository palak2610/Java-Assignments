import java.util.*;
public class MapExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("one", "1st");
		map.put("second", new Integer(2));
		map.put("third", "3rd");
		map.put("third", "III");
		Set set = map.keySet();
		Collection collection = map.values();
		Set set2 = map.entrySet();
		System.out.println(set + "\n" + collection + "\n" + set2);
		
	}

}
