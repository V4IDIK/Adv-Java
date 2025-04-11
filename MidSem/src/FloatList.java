import java.util.ArrayList;
import java.util.List;

public class FloatList {
	public static void main(String[] args) {
		
		List<Float> list = new ArrayList<Float>();
		list.add(1.4f);
		list.add(2.3f);
		list.add(3.1f);
		list.add(1.27f);
		
		System.out.println(list);
		
		System.out.println("Printing Seperately");
		for(float l:list) {
			System.out.println(l);
		}
	}

}