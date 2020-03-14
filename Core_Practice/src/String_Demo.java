
public class String_Demo {
	
	void Method(){
	
		int k=0;
		
		
		try {
			k=20/0;
		}
		
    
		
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
		

		 catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
		System.out.println("hry");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String_Demo  sd =new String_Demo();
		sd.Method();
	}

}
