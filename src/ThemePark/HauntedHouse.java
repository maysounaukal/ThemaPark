package ThemePark;

public class HauntedHouse extends Attraction implements Rideable{
private AgeLimit limit = AgeLimit.KID;



public AgeLimit getLimit() {
	return limit;
}



public void setLimit(AgeLimit limit) {
	this.limit = limit;
}



@Override
public void Ride(Person iemand) {
	System.out.println("hij is kind");
	
}

}
