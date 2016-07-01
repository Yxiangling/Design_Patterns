package command;

public class ConcreteCommand extends Command{
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	public void execute_rev(){
		this.receiver.rev_command();
	}
	
	public void execute_call(){
		this.receiver.notify_command();
	}
}
