
public class Bill {
	private int billNo;
	private double total;
	private double gst;
	private double finaltotal;
	public Bill(int billNo, double total, double gst, double finaltotal) {
		this.billNo = billNo;
		this.total = total;
		this.gst = gst;
		this.finaltotal = finaltotal;
	}
	public int getBillNo() {
		return billNo;
	}
	public double getTotal() {
		return total;
	}
	public double getGst() {
		return gst;
	}
	public double getFinaltotal() {
		return finaltotal;
	}
	

}
