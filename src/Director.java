
public class Director extends Handler {

	@Override
	public void operation(Message message) {
		// TODO Auto-generated method stub
		if(message.amount < 50) {
			System.out.print("Director process the message!\n The amount is " + message.amount);
		}else {
			handler.operation(message);
		}
	}

}
