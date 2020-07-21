
package Product;

public class Shirts extends Product {
	private String Patternscreen;
	private boolean Plain;
	private boolean hasButton;
	
	public Shirts() {
		
	}
	public Shirts(String Patternscreen,boolean Plain,boolean hasButton) {
		this.Patternscreen = Patternscreen;
		this.Plain = Plain;
		this.hasButton = hasButton;
	}
	public String getPatternscreen() {
		return Patternscreen;
	}
	public void setPatternscreen(String patternscreen) {
		Patternscreen = patternscreen;
	}
	public boolean isPlain() {
		return Plain;
	}
	public boolean isHasButton() {
		return hasButton;
	}
	
}
