package practiceQuestion;

import java.util.ArrayList;
import java.util.List;


public class ProductMain {

	public static void main(String[] args) {
		 List<Product> list=new ArrayList<Product>();  
	        list.add(new Product(1,"Samsung A5",17000f));  
	        list.add(new Product(3,"Iphone 6S",65000f));  
	        list.add(new Product(2,"Sony Xperia",25000f));  
	        list.add(new Product(4,"Nokia Lumia",15000f));  
	        list.add(new Product(5,"Redmi4 ",26000f));  
	        list.add(new Product(6,"Lenevo Vibe",19000f));  
	       
	        
	        list.stream().filter(p -> p.price > 20000).forEach(p->{System.out.println(p.name+","+p.price);System.out.println(p.price+10);});
	        list.stream().filter(p->p.name.contains("a")).forEach(p->System.out.println(p.name.replace("a", "e")));
	}

}
