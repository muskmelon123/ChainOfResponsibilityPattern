
public class Client {

	public static void main(String args[]) {
		Director director = new Director();
		VicePresident vicePresident = new VicePresident();
		Boss boss = new Boss();
		
		director.setHandler(vicePresident);
		vicePresident.setHandler(boss);
		
		Message message = new Message();
		message.setAmount(150);
		
		director.operation(message);
	}
}

//注意:职责链模式就是相当于在每个处理的类里面加链的下一个类的引用，然后message传过来不符合条件就调用下一个的operation.
