package remote;

public class UndoCommand implements Command{

	Remote_Control parent;
	
	public UndoCommand(Remote_Control r) {
		parent = r;
	}
	
	@Override
	public void execute() {
		//Because each command exists as a toggle
		//We can simply execute the last command again to undo
		System.out.println("Undoing last command...");
		parent.lastUsedCommand.execute();		
	}
	
	

}
