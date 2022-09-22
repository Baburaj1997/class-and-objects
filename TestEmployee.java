package javatrain;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(1102,"viraj","kumar",60000);
		System.out.println(e1.getname());
		System.out.println(e1);
		System.out.println(e1.raiseSalary(60000));
	}

}
