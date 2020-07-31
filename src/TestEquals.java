
public class TestEquals {
	public static void main(String[] args)
	{
	String a = new String("Chinh");
    String b = new String("Chinh");
		System.out.println("a = b " + (a==b));
	
		System.out.println("a = b " + a.equals(b));
		
		
		
		Integer i = new Integer(5);
		i = new Integer(10);
		System.gc();
		System.out.print(i);
	}
	
	

}
