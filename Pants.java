package Product;

public class Pants extends Product {
	private boolean withZipper;
	private boolean Jeans;
	
	public Pants() {
		
	}
	public Pants(boolean withZipper,boolean Jeans) {
		this.withZipper = withZipper;
		this.Jeans = Jeans;
	}
	
	public boolean getwithZipper() {
		return withZipper;
	}
	public boolean getJeans() {
		return Jeans;
	}
}
	