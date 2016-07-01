package command;

public class Receiver {
	public void rev_command(){
		System.out.println("接受者-接收命令者业务逻辑");
	}
	
	public void notify_command(){
		System.out.println("接受者-传递业务逻辑给执行者");
	}
}
