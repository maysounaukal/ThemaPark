package ThemePark;

public class Saloon extends DrinkStand{
private AgeLimit limit = AgeLimit.Adult;

@Override
void SheckAge() {
	System.out.println("hij is adult");
	
}

@Override
public void Sell() {
	System.out.println();
	
}



}
