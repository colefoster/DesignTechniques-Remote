package remote;

public class AC_Command implements Command{
	AC a;
	Remote_Control remote;
	
	public AC_Command(AC ac, Remote_Control parent) {
		a = ac;
		remote = parent;
	}
	
	@Override
	public void execute() {
		a.toggle();
		remote.setLastUsedCommand(this);
	}
}
