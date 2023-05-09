package sources_code;

public class OrderParameter {
	private int iDn;
	private String categoryn;
	private int ido;
	private String namen;
	private  String picturen;
	private String descriptionn;
	private double pricen;
	private  String materialn;
	private  String cleaninign;
	private  int quantityn;
	
	public OrderParameter setid(int iDn) {
		 this.iDn = iDn;
	        return this;
	}
	
	public OrderParameter setcategory(String categoryn) {
		 this.categoryn = categoryn;
	        return this;
	}
	
	public OrderParameter setido(int ido) {
		 this.ido = ido;
	        return this;
	}
	public OrderParameter setnamen(String namen) {
		 this.namen= namen;
	        return this;
	}
	
	public OrderParameter setpicturen( String picturen) {
		 this.picturen= picturen;
	        return this;
	}
	public OrderParameter setdescriptionn( String descriptionn) {
		 this.descriptionn= descriptionn;
	        return this;
	}
	public OrderParameter setmaterialn( String materialn) {
		 this.materialn= materialn;
	        return this;
	}
	public OrderParameter setpricen( double pricen) {
		 this. pricen= pricen;
	        return this;
	}
	
	public OrderParameter setcleaninign( String cleaninign) {
		 this.cleaninign= cleaninign;
	        return this;
	}
	public OrderParameter setquantityn(int quantityn) {
		 this.quantityn = quantityn;
	        return this;
	}

	

	public int getiDn() {
		return iDn;
	}

	public String getcategoryn() {
		return categoryn;
	}

	public int getido() {
		
		return ido;
	}

	public String getnamen() {
		
		return namen;
	}

	public String getpicturen() {
		
		return picturen;
	}

	public String getdescriptionn() {
		
		return descriptionn;
	}

	public double getpricen() {
		
		return pricen;
	}

	public String getmaterialn() {
		
		return materialn;
	}

	public String getcleaninign() {
		
		return cleaninign;
	}

	public int getquantityn() {
		
		return quantityn;
	}
	public void printop() {
		 System.out.printf("ID: "  );
		 System.out.print( iDn );
		 System.out.printf(" || Category product: %s || " , categoryn);
		 System.out.printf("Id  product: %s || ",getido());
		 System.out.printf("Name product: %s || ",namen); 
		 System.out.printf("Link for Picture product: %s || ",picturen);
		 System.out.printf("The discription : %s || ",descriptionn);
		 System.out.print("The price :  ");
		 System.out.print(pricen);
		 System.out.printf(" || The Material: %s  || ",materialn);
		 System.out.printf("The type cleaning : %s || .",cleaninign);
		 System.out.printf("The Quantity : ");
		 System.out.print(quantityn);
		 System.out.print("\n" );

	}
}