package remote;

public class ResetCommand implements Command{

	Remote_Control remote;
	
	public ResetCommand(Remote_Control parent) {
		remote = parent;
	}
	@Override
	public void execute() {
		System.out.println("Resetting ALL slots... ");
		remote.setACCommand(new EmptyCommand());
		remote.setGarageDoorCommand(new EmptyCommand());
		remote.setLivingRoomLightsCommand(new EmptyCommand());
		remote.setOutdoorLightsCommand(new EmptyCommand());
		remote.setUnusedCommand(new EmptyCommand());
		
		remote.setLastUsedCommand(new EmptyCommand());
	}

	
}
