package Assignment_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
public class assignment9_1 {

	public static void main(String[] args) {
		List<fruit>fruits=Arrays.asList(new fruit("apple",70,10,"red"),
				new fruit("apple",50,10,"red"),
				new fruit("mango",20,35,"yellow"),
				new fruit("banana",6,50,"yellow"),
				new fruit("watermelon",12,35,"green"),
				new fruit("grapes",50,7,"green"));
		List<String>lowcalories=fruits.stream().filter(fruit->fruit.getCalories()< 100)
				.map(fruit->fruit.getName()).sorted((o1,o2)-> o2.compareTo(o1)).collect(Collectors.toList());
				
		System.out.println(lowcalories);
		System.out.println("----------------");
	
		System.out.println("display color wise list of fruit names");
		
		fruits.forEach(fruit->System.out.println("color wise list of fruit :\n"+"color: "+fruit.getColor()+"|"+"name: "+fruit.getName()));
		System.out.println("----------------");
		
		List<String>redcolor=fruits.stream().filter(fruit->fruit.getColor()== "red")
				.map(fruit->fruit.getName()).sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList());
		
		System.out.println(redcolor);
		
		
        Trader prasad = new Trader("pavan", "hyd");
        Trader nitish = new Trader("kirab", "nlg");
        Trader kiran = new Trader("hari", "mumbai");
        Trader naveen = new Trader("naveen", "pune");
        
        List<Transaction> transactions = Arrays.asList(new Transaction(kiran, 2011, 300),
                new Transaction(naveen, 2012, 1000), 
                new Transaction(naveen, 2011, 400),
                new Transaction(prasad, 2012, 710), 
                new Transaction(prasad, 2012, 700), 
                new Transaction(nitish, 2012, 9500));
        
        		
        		List<Transaction> tr2011 = transactions.stream()
        				.filter(transaction -> transaction.getYear() == 2011)
        				.sorted(comparing(Transaction::getValue))
        				.collect(toList());
        		System.out.println(tr2011);
        	
        		List<String>cities=transactions.stream().map(transaction->transaction.getTrader().getCity()).distinct().collect(toList());
        		System.out.println(cities);
        	
        		List<Trader>traders=transactions.stream().map(Transaction::getTrader).filter(trader->trader.getCity().equals("pune")).distinct().sorted(comparing(Trader::getName)).collect(toList());
        		System.out.println(traders);
        	
        		String traderStr = 
        				transactions.stream()
        	                        .map(transaction -> transaction.getTrader().getName())
        	                        .distinct()
        	                        .sorted()
        	                        .reduce("", (n1, n2) -> n1 + n2);
        	    System.out.println(traderStr);
        	   
        	    boolean puneBased =
        	            transactions.stream()
        	                        .anyMatch(transaction -> transaction.getTrader()
        	                                                            .getCity()
        	                                                            .equals("indore"));
        	    System.out.println(puneBased);
        	  
        	    int highestValue = 
        	            transactions.stream()
        	                        .map(Transaction::getValue)
        	                        .reduce(0, Integer::max);
        	    System.out.println(highestValue); 
        	   
        	    transactions.stream()
                			.map(Transaction::getTrader)
                			.filter(trader -> trader.getCity().equals("delhi"));
        	    System.out.println(transactions);
        	   
        	    int smallestValue = 
        	            transactions.stream()
        	                        .map(Transaction::getValue)
        	                        .min(Integer::compare).get();
        	    System.out.println(smallestValue); 
	}

}
class Transaction {
	private Trader trader;
	private int year;
	private int value;
	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + this.trader + ", year=" + this.year + ", value=" +this.value + "]";
	}
	
	
	
}
class Trader {
	private final String name;
	private final String city;
	
	public Trader (String n, String city){
		this.name=n;
		this.city=city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Trader [name=" + this.name + ", city=" + this.city + "]";
	}
	
	
	
}
class news {
	private final int newsId;
	private final String postedByUser;
	private final String commentByUser;
	private final String comment;
	public news(int newsId, String postedByUser, String commentByUser, String comment) {
		
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public String getComment() {
		return comment;
	}
	@Override
	public String toString() {
		return "news [newsId=" + this.newsId + ", postedByUser=" + this.postedByUser + ", commentByUser=" + this.commentByUser
				+ ", comment=" + this.comment + "]";
	}
	
	
	
}
class fruit {
	
	private final String name;
	private final int calories;
	private final int price;
	private final String color;
	public fruit(String name, int calories, int price, String color) {
		
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "fruit [name=" + this.name + ", calories=" + this.calories + ", price=" + this.price + ", color=" + this.color + "]";
	}
	public static void add(String string, int i, int j, String string2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

