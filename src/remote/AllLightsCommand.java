package remote;

public class AllLightsCommand implements Command{

	OutdoorLights outdoorLights;
	LivingRoomLights livingRoomLights;
	Remote_Control remote;
	
	public AllLightsCommand(OutdoorLights outdoor, LivingRoomLights livingRoom, Remote_Control parent) {
		outdoorLights = outdoor;
		livingRoomLights = livingRoom;
		remote = parent;
	}
	
	@Override
	public void execute() {
		outdoorLights.toggle();
		livingRoomLights.toggle();
		remote.setLastUsedCommand(this);
	}

}
