package javatrain;

public class Author {
	String FirstName;
	String LastName;
	String BookName;
	
	public Author() {
		System.out.println("am default");
	}
	
	public Author(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}

	public Author(String fname,String lname,String bookname) {
		FirstName=fname;
		LastName=lname;
		BookName=bookname;
	}
	public void setname(String fname,String lname) {
		FirstName=fname;
		LastName=lname;
	}
	public String getname() {
		String Name;
		Name=FirstName+LastName;
		return Name;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getBookName() {
		return BookName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	@Override
	public String toString() {
		return "Author [FirstName=" + FirstName + ", LastName=" + LastName + ", BookName=" + BookName + "]";
	}
	

}
