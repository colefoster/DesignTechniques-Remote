package remote;

public class EmptyCommand implements Command{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("No Command Executed: This slot is unused");
	}

}
