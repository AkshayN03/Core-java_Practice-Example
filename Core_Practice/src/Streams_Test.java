import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 
 */

/**
 * @author:Akshay Nayakwadi
 * @date:14-Mar-2020
 * @description:
 */
public class Streams_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=Arrays.asList("Hey","Hello","Hi","Great");
		ls.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String wish) {
				
				return !wish.equals("Great");
			}
			
		}).forEach(new Consumer<String>() {

			@Override
			public void accept(String wish) {
				System.out.println(wish);
 
				
			}
		});

		
	}
}
