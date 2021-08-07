public abstract class Price {
  
	public int frequentRenterPoints;

	public abstract int getPriceCode();
   
   
   public abstract double getCharge(int daysRented);
   
   public int getFrequentRenterPoints(int daysRented) {
       return 1;
   }
   
}