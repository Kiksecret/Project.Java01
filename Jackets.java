package Product;

public class Jackets extends Product {
	private boolean hasHat;
	private boolean isLeather;
	
	public Jackets() {
		
	}
	public Jackets(boolean hasHat,boolean isLeather) {
		this.hasHat = hasHat;
		this.isLeather = isLeather;
	}
	public boolean gethasHat() {
		return hasHat;
	}
	public boolean getisLeather() {
		return isLeather;
	}
}
