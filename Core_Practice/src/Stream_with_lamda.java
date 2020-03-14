import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 */

/**
 * @author:Akshay Nayakwadi
 * @date:14-Mar-2020
 * @description:
 */
public class Stream_with_lamda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		List<Integer> listOfIntegers=Arrays.asList(20,11,30,40,50);
		
		listOfIntegers.stream()
		                 .filter(i -> i%2==0).forEach(i ->System.out.println(i));
		

	}

}
