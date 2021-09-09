package assignment6;
import java.util.*;
import java.util.Map.Entry;
public class assignment6_1 {
	public static void main(String[] args) {
	TreeMap<Long,String> tre=new TreeMap<Long,String>();
	tre.put((long) 1, "7091234");
	tre.put((long) 2, "7091234");
	tre.put((long) 3, "7091234");
	tre.put((long) 4, "7091234");
	Set<Long> keys=tre.keySet();
	Collection<String> key=tre.values();
	System.out.println(keys);
	System.out.println(key);
	for (Entry<Long, String> entry : tre.entrySet()) {
	    Long keyn = entry.getKey();
	    String value = entry.getValue();

	    System.out.printf("%s : %s\n", keyn, value);
	    System.out.println("descendingMap: "+tre.descendingMap());


	}
	}

}
