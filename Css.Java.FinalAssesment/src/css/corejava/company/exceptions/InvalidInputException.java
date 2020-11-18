package css.corejava.company.exceptions;

public class InvalidInputException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}


	public InvalidInputException() {
		super();
		this.message="please enter a valid input";
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
