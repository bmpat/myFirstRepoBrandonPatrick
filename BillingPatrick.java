
public class BillingPatrick {
	// Brandon Patrick
	public static void main(String[] args){
		
		System.out.printf("$%.2f\n",(computePhotoBill(19.99))); // calls each method with their requirements
		System.out.printf("$%.2f\n",(computePhotoBill(19.99,2)));
		System.out.printf("$%.2f\n", (computePhotoBill(19.22,2,.1)));
	}
	
	public static double computePhotoBill(double a){ // method for just a double
		final double tax = .08; // for the tax
		double taxResult = a * tax;
		double result = a + taxResult;
		return result;
	}
	public static double computePhotoBill(double a, int b){ //method for a double and int
		final double tax = .08;
		double bookCost = a*b;
		double taxResult = bookCost * tax;
		double result = bookCost + taxResult;
		return result;
	}
	public static double computePhotoBill(double a, int b, double c){ // method for two doubles and a int
		final double tax = .08;
		double bookCost = a*b;
		double coupon = bookCost * c;
		double bookWithCoupon = bookCost - coupon;
		double taxResult = bookWithCoupon * tax; 
		double result = bookWithCoupon + taxResult; 
		return result;
	}
}
