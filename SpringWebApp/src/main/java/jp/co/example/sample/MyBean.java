package jp.co.example.sample;

public class MyBean {
	private String message;
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public void hello(){
		System.out.println("メッセージがあります:"+this.message);
	}
}
