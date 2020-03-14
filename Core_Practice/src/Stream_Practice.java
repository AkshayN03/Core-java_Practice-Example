import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Practice {
	
	public static void main(String[] ar) {
		
		
		String s= new String("Akshay");
		
		List<Integer> ls =new ArrayList();
		ls.add(12);
		ls.add(9);
		ls.add(1);
		ls.add(6);
		System.out.println(ls);
		
		List l2=ls.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
