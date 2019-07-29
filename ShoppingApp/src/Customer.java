
public class Customer {
	private int custId;
	private String custName;
	private Product p1[];
	private Bill b1;
	public Customer(int custId, String custName, Product p1[]) {
		this.custId = custId;
		this.custName = custName;
		this.p1 = p1;
	}
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public Product[] getP1() {
		return p1;
	}
	public Bill getB1() {
		return b1;
	}
	public void setB1(Bill b1) {
		this.b1 = b1;
	}
	

}
