package ThemePark;

public class Main {

	public static void main(String[] args) {
		ThemePark Maysoun = new ThemePark();
		RollerCoaster roller1 = new RollerCoaster();
		roller1.name = "Dragon Kahn";
		roller1.setCapacity(80);
		roller1.setLimit(AgeLimit.Teen);

        RollerCoaster roller2 = new RollerCoaster();
        roller2.name = "Wooden Thunder";
        roller2.setCapacity(60);
        roller2.setLimit(AgeLimit.KID);
        
        
        HauntedHouse house = new HauntedHouse();
        house.name = "Templo Del fugeo";
        house.setCapacity(100);
        house.setLimit(AgeLimit.KID);
        
        TeaCups tea = new TeaCups();
        tea.name = "Gaston spin";
        tea.setCapacity(35);
        tea.setLimit(AgeLimit.SMALLKID);
        
        Rideable[] rid = new Rideable[4] ;
        rid[0] = roller1;
        rid[1] = roller2;
        rid[2] = house;
        rid[3] = tea;
        
        for(Rideable e: rid) {
        	if(e instanceof Attraction) {
        		((Attraction) e).getCapacity();
        	}
    System.out.println("Totale AttractieCapaciteit van " +((Attraction)e).getName()+ " is" + ((Attraction) e).getCapacity());
        }
        System.out.println("******************************");
        
        System.out.println();
        
        IceCreamShop ice = new IceCreamShop();
        ice.setCones(300);
        ice.setIceCreamBalls(500);
        
        IceCreamShop ice1 = new IceCreamShop();
        ice1.setCones(1000);
        ice1.setIceCreamBalls(2000);
        
        
        
        
		

	}

}
