public class TestShoppingApp {
	public static void main(String[] args) {
		Customer c1=accept();
		c1=calculate(c1);
		display(c1);
	}
	public static Customer calculate(Customer c1){
		
		Product arr[]=c1.getP1();
		double total=0,gst,finaltotal;
		for(Product p1:arr){
			total=total+p1.getProdPrice()*p1.getProdQty();
		}
		gst=total*0.12;
		finaltotal=total+gst;
		
		Bill b1=new Bill(1,total, gst, finaltotal);
		c1.setB1(b1);
		return c1;
		
	}
	public static Customer accept(){
		Product p1=new Product(101, "PS4", 45000,2);
		Product p2=new Product(102, "Laptop",100,2);
		Product arr[]=new Product[2];
		arr[0]=p1;
		arr[1]=p2;
		Customer c1=new Customer(1,"Omkar",arr);
		return c1;
	}
	public static void display(Customer c1){
		System.out.println("\t\t------------CUSTOMER DETAILS----------------- \t");
		System.out.println("\t\tCust Id \t:"+c1.getCustId());
		System.out.println("\t\tCust Name \t:"+c1.getCustName());
		
		Product arr[]=c1.getP1();
		
		for(Product p1:arr)
		{
			System.out.println("\t\t-------------PRODUCT DETAILS-------------- \t");
			System.out.println("\t\tProduct Id \t:"+p1.getProdId());
			System.out.println("\t\tProduct Name \t:"+p1.getProdName());
			System.out.println("\t\tProduct Price \t:"+p1.getProdPrice());
			System.out.println("\t\tProduct Qty \t:"+p1.getProdQty());
		}
		
		System.out.println("\t\t-------------BILL DETAILS--------------\t");
		System.out.println("\t\tBill No\t\t :"+c1.getB1().getBillNo());
		System.out.println("\t\tTotal\t\t :"+c1.getB1().getTotal());
		System.out.println("\t\tGST\t\t :"+c1.getB1().getGst());
		System.out.println("\t\tFinal Total\t :"+c1.getB1().getFinaltotal());	

	}
}
