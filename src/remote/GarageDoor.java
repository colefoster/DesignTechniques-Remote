package remote;

public class GarageDoor {
	
	public Boolean isOpen = false;
	
	void toggle() {
		isOpen = !isOpen;
		if(isOpen) {
			System.out.println("Garage Door now OPEN");
		}
		else {
			System.out.println("Garage Door now CLOSED");
		}
	}
}
