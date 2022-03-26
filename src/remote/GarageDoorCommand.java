package remote;

public class GarageDoorCommand implements Command{

	GarageDoor g;
	Remote_Control remote;
	
	public GarageDoorCommand(GarageDoor garageDoor, Remote_Control parent) {
		g = garageDoor;
		remote = parent;
	}
	@Override
	public void execute() {
		g.toggle();
		remote.setLastUsedCommand(this);
	}

	
}
