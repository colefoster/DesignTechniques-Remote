package remote;

public class OutdoorLightsCommand implements Command {

	OutdoorLights outdoorLights;
	Remote_Control remote;
	
	public OutdoorLightsCommand(OutdoorLights lights, Remote_Control parent) {
		outdoorLights = lights;
		remote = parent;
	}
	
	@Override
	public void execute() {
		outdoorLights.toggle();
		remote.setLastUsedCommand(this);
	}

}
