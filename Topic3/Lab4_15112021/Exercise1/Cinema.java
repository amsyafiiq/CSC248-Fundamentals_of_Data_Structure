package Exercise1;
/* 
Cinema class definition
*/
public class Cinema
{	
	private String cinCode ; 		//cinema code, i.e. Ha111, Hal12 
	private String movieTit1e;
	private double price; 
	private String modePayment; 	//cash or credit card 
	private boolean membership; 	//true: member, false: non-member
    public Cinema next;
	
	//normal constructor
	public Cinema(String cc, String mt, double p, String mp, boolean m) {
		this.cinCode = cc;
		this.movieTit1e = mt;
		this.price = p;
		this.modePayment = mp;
		this.membership = m;
	}
	
	//accesors: getCode(), getTit1e(), getPrice(), getMode(), getMembership()
	public String getCode() { return this.cinCode; }
	public String getMovieTit1e() { return this.movieTit1e; }
	public double getPrice() { return this.price; }
	public String getMode() { return this.modePayment; }
	public boolean getMembership() { return this.membership; }	
	
	//printer: toString()
	public String toString() {
		return "Cinema code: " + this.getCode() + "\n" +
			   "Movie Title: " + this.getMovieTit1e() + "\n" +
			   "Price: " + this.getPrice() + "\n" +
			   "Payment Mode:" + this.getMode() + "\n" +
			   "Membership:" + this.getMembership() + "\n";	
	}
}

