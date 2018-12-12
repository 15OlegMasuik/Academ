package mate.acatemy;

public class Door {
	int hight=33;
	String color="white";
	boolean open =true;

	void getInformation(){
		System.out.println("Height:"+hight+"color:"+color+"Stan:"+open);
	}
	void getInfoOpen() {
		if (open = true) {
			System.out.println("Open");

		} else {
			System.out.println("close");
		}
	}

	void closeDoor() {
		open = false;
	}

	void opendoor() {
		open = true;
	}

}
