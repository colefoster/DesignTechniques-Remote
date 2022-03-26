package remote;

public class AC {
	
	public Boolean isOn = false;
	
	void toggle() {
		isOn = !isOn;
		if(isOn) {
			System.out.println("AC turned ON");
		}
		else {
			System.out.println("AC turned OFF");
		}
	}
}
