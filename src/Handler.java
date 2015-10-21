
public abstract class Handler {

	protected Handler handler;
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	};
	
	public abstract void operation(Message message);
}
