package transaction.RestApi.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class paymentException extends RuntimeException {
	private String message;
	public paymentException()
	{
		
	}
	public paymentException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	


	
	
	
//
////	public paymentException(String message) {
////		 super(String.format("only Supported with debit "));
////		
////		
////	}
//	
	
}
