package ThemePark;

public class RollerCoaster extends Attraction{
private AgeLimit limit = AgeLimit.Teen;



public AgeLimit getLimit() {
	return limit;
}



public void setLimit(AgeLimit limit) {
	this.limit = limit;
}



@Override
public void Ride(Person iemand) {
	System.out.println("Making 4 loops and one barrelScrew");
	
}

}
