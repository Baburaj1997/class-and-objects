package javatrain;

public class TestAuthor {

	public static void main(String[] args) {
		System.out.println("************************************* ");
		Author a1=new Author();
		Author a2=new Author("aryan","babu");
		Author a3=new Author("viraj","kumar","darkworld");
		System.out.println(a2.getname());//value of 2nd object.
		System.out.println(a3.toString());
		
		System.out.println("************************************* ");
	}

}
