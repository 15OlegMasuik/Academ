package mate.acatemy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	CatBox catBox = new CatBox();
		//System.out.println(catBox.width);
		Door door1 = new Door();
		door1.getInfoOpen();
		door1.getInformation();
		door1.closeDoor();
		
		Light lamp1= new Light();
		lamp1.info();
		lamp1.turnOff();
		lamp1.info();
		lamp1.turnOn();
		
	}

}
