package ThemePark;

public class IceCreamShop extends FoodStand{
public int cones;
public int iceCreamBalls;
public void MakeIceCream(int balls) {
	boolean flag = false;
	while(flag == false) {
		
	}
	if(getCones() <= 0) {
		System.out.println("er is geen cones meer");
	}else (getIceCreamBalls() <= 0){
		System.out.println("er is geen balls meer");
	}
}
@Override
public void Sell() {
	// TODO Auto-generated method stub
	
}
public int getCones() {
	return cones;
}
public void setCones(int cones) {
	this.cones = cones;
}
public int getIceCreamBalls() {
	return iceCreamBalls;
}
public void setIceCreamBalls(int iceCreamBalls) {
	this.iceCreamBalls = iceCreamBalls;
}

}
