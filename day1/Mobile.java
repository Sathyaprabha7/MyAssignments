package week1.day1;

public class Mobile {
	
 public void makeCall(String mobileModel, float mobileWeight ) {
	 System.out.println("Calling You!!"); 
	 System.out.println(mobileModel + " is my mobile with a weight of " + mobileWeight);
 };
 
 public void sendMessage(boolean isFullCharged, int mobileCost) {
	 System.out.println("Message was sent!!");
	 System.out.println("Is fully charged value as " + isFullCharged + " and the price is " + mobileCost);
 }
 
 public static void main(String[] args) {
	 Mobile m1 = new Mobile();
	 Mobile m2 = new Mobile();
	 m1.makeCall( "Samsung S4", 250.38f);
	 m2.sendMessage(true, 55000);
	 
 }
};
