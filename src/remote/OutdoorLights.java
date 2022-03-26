package remote;

public class OutdoorLights {
	public Boolean areOn = false;
	
	void toggle() {
		areOn = !areOn;
		if(areOn) {
			System.out.println("Outdoor Lights turned ON");
		}
		else {
			System.out.println("Outdoor Lights turned OFF");
		}
	}
}
