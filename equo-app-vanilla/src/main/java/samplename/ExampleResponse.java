package myapp;

public class ExampleResponse {

	private static int ID_COUNTER = 0;

	private int id = 0;
	private String message;

	public ExampleResponse(String message) {
		this.message = message;
		this.id = ++ID_COUNTER;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
