
public class Boss extends Handler {

	@Override
	public void operation(Message message) {
		// TODO Auto-generated method stub
		if(message.amount < 200) {
			System.out.print("Boss process the message!\n The amount is " + message.amount);
		}else {
			//handler.operation(message);
			System.out.print("The amount is out!");
		}
	}

}
