package episode35;

public class BMW extends Bike{
	
	
	int mileage = 20;
	
	String getColor() {
		return "limeStone red";
	}
	
	public static void main(String[] args) {
		BMW myBike = new BMW();
		myBike.getColor();
		int mileage2 = myBike.mileage;
		System.out.println(mileage2);
		boolean hasDisc = myBike.hasDisc();
		myBike.applyBrake();
		Vehicle myV = new Vehicle();
		myV.applyBrake();
	}

}
