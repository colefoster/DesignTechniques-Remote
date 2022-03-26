package remote;

public class LivingRoomLightsCommand implements Command {

	LivingRoomLights livingRoomLights;
	Remote_Control remote;
	
	public LivingRoomLightsCommand(LivingRoomLights lights, Remote_Control parent) {
		livingRoomLights = lights;
		remote = parent;
	}
	@Override
	public void execute() {
		livingRoomLights.toggle();		
		remote.lastUsedCommand = this;
	}

}
