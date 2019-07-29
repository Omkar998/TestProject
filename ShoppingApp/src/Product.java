
public class Product {
	private int prodId;
	private String prodName;
	private double prodPrice;
	private int prodQty;
	public Product(int prodId, String prodName, double prodPrice, int prodQty) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	}
	public int getProdId() {
		return prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public int getProdQty() {
		return prodQty;
	}
	

}
