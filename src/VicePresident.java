
public class VicePresident extends Handler {

	@Override
	public void operation(Message message) {
		// TODO Auto-generated method stub
		if(message.amount < 100) {
			System.out.print("VicePresident process the message!\n The amount is " + message.amount);
		}else {
			handler.operation(message);
		}
	}

}
