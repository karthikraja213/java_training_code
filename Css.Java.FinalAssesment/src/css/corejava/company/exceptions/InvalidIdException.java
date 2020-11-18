package css.corejava.company.exceptions;

public class InvalidIdException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	public InvalidIdException() {
		super();
		this.message="please enter a valid id";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
