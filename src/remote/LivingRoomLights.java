package remote;

public class LivingRoomLights {
	
	public Boolean areOn = false;
	
	void toggle() {
		areOn = !areOn;
		if(areOn) {
			System.out.println("Living Room Lights turned ON");
		}
		else {
			System.out.println("Living Room Lights turned OFF");
		}
	}
}
