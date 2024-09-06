package transaction.RestApi.Exception;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import transaction.RestApi.Dto.errorDetails;

@RestControllerAdvice
@AllArgsConstructor
@NoArgsConstructor
public class globalException extends paymentException {

//	public globalException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
	
//	public globalException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}

	
	@ExceptionHandler(paymentException.class)
	public ResponseEntity<errorDetails> handlePaymentException( paymentException exception,WebRequest webRequest)
	{
		errorDetails errorDeatils=new errorDetails();
		
		errorDeatils.setDetail(webRequest.getDescription(false));
		errorDeatils.setMessage(exception.getMessage());
		
		
		return new ResponseEntity<errorDetails>(errorDeatils, HttpStatus.NOT_ACCEPTABLE);
	}

}
