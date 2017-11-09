package mum.edu.exception;



//@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No File found under this directory.")
public class NoFileUploadedException extends RuntimeException{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public NoFileUploadedException(String message) {
		this.message = message;
	}
}
