package javatrain;

public class TestInvoiceItem {

	public static void main(String[] args) {
		InvoiceItem in1=new InvoiceItem("pen12","PEN",120,12.0);
		System.out.println(in1.getDesc());
		System.out.println(in1);
		System.out.println(in1.getTotal());
	}

}
