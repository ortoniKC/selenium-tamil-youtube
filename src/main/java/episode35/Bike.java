package episode35;

public class Bike extends Vehicle{
	
	public boolean hasDisc() {
		return true;
	}
	@Override
	public void applyBrake(){
		super.applyBrake();
		System.out.println("BIKE -- Brake applied");
	}

}
