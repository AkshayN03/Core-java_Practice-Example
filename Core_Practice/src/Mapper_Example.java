import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 
 */

/**
 * @author:Akshay Nayakwadi
 * @date:14-Mar-2020
 * @description:
 */
public class Mapper_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=Arrays.asList("Aksjgiiaeaoueh;rop","dsgre","grerebeb", "aregerfb"," ");
		//Using anonymous inner class
		ls.stream().map(new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
			
				return t.length();
			}
		}).forEach(System.out::println);
		
		
		ls.stream().map(new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
			
				return t.length();
			}
		}).forEach(t->System.out.println(t));
		     
		//New way using complete lambda expressions
		ls.stream()
		     .map(String::toUpperCase)
		     .forEach(System.out::println);
		
		

	}

}
