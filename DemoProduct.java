package Product;

public class DemoProduct {

	public static void main(String[] args) {
		Shirts s1 = new Shirts();
		s1.Productname = "Traveller Shirt" ;
		s1.Type = "Polo" ;
		s1.setSize("M");
		s1.setColor("Black");
		s1.setPatternscreen("Mickey");
		s1.isWithpocket();
		s1.isPlain();
		s1.isHasButton();
		s1.setPrice(590);
		
		Jackets j1 = new Jackets();
		j1.Productname = "Basic Zipped";
		j1.Type = "Bomber";
		j1.setSize("L");
		j1.setColor("Grey");
		j1.isWithpocket();
		j1.gethasHat();
		j1.getisLeather();
		j1.setPrice(1190);
		
		System.out.println("Product Name : "+s1.Productname);	
		System.out.println("Type : "+s1.Type);
		System.out.println("Size : "+s1.setSize(s));
		System.out.println("Color : "+s1.setColor(s));
		
		
		
		

	                                                   
	}

}
