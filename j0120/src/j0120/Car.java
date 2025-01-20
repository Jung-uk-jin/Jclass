package j0120;

public class Car {
	String color;
	String gear;
	int door;
	
	Car(){
		this("black","auto",4);
	}
	Car(String color, String gear, int door){
		this.color =color;
		this.gear =gear ;
		this.door =door;
	}
	
	Car(Car c){
		color = c.color;
		gear = c.gear;
		door = c.door;
	}

}
