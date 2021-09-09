package assignment5;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class assignment5_4 {
public static void main(String[] args) {
    Map<Integer,Demo> map=new HashMap<Integer, Demo>();
    Demo d1= new Demo(1,"hi",new Date(),1,1);
    Demo d2= new Demo(2,"this",new Date(),2,1);
    Demo d3= new Demo(3,"is",new Date(),3,1);
    Demo d4= new Demo(4,"mytest",new Date(),4,1);
    //adding values to map
    map.put(d1.getKey(), d1);
    map.put(d2.getKey(), d2);
    map.put(d3.getKey(), d3);
    map.put(d4.getKey(), d4);
    //retrieving values from map
    Set<Integer> keySet= map.keySet();
    for(int i:keySet){
        System.out.println(map.get(i));
    }
    //searching key on map
    System.out.println(map.containsKey(d1.getKey()));
    //searching value on map
    System.out.println(map.containsValue(d1));
}

}
class Demo{
    private int key;
    private String message;
    private Date time;
    private int count;
    private int version;

    public Demo(int key,String message, Date time, int count, int version){
        this.key=key;
        this.message = message;
        this.time = time;
        this.count = count;
        this.version = version;
    }
   public String getMessage() {
        return message;
    }
    public Date getTime() {
        return time;
    }
    public int getCount() {
        return count;
    }
    public int getVersion() {
        return version;
    }
    public int getKey() {
        return key;
    }
    @Override
    public String toString() {
        return "Demo [message=" + message + ", time=" + time
                + ", count=" + count + ", version=" + version + "]";
    }

}