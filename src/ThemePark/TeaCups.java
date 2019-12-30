package ThemePark;

public class TeaCups extends Attraction implements Rideable{
private AgeLimit limit = AgeLimit.SMALLKID;



public AgeLimit getLimit() {
	return limit;
}



public void setLimit(AgeLimit limit) {
	this.limit = limit;
}



@Override
public void Ride(Person iemand) {
	System.out.println("hij is kleinkind");
	
}

}
