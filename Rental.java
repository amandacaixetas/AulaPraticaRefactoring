public class Rental {

   private Movie _movie;
   private int _daysRented;
   private int frequentRenterPoints;

   public Rental(Movie movie, int daysRented, int frequentRenterPoints) {
      _movie = movie;
      _daysRented = daysRented;
      this.frequentRenterPoints = frequentRenterPoints;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
   
   public double getCharge(){
      return _movie.getCharge(_daysRented);
   }
   
   
   public int getFrequentRenterPoints() {
	   // add frequent renter points
	   this.frequentRenterPoints ++;
	   return frequentRenterPoints;
	}
   
}