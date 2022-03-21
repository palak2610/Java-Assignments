import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("One");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(3));
		set.add(new Float(5.0F));
		set.add("second");
		set.add(new Integer(4));
		System.out.println(set);
	}

}
