package transaction.RestApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import transaction.RestApi.Dto.orderRequest;
import transaction.RestApi.Dto.orderResponse;
import transaction.RestApi.Service.orderService;

@RestController
@RequestMapping("/order")
public class oder {
	@Autowired
	private orderService orderService;
	public oder(orderService orderService) {
	
		this.orderService = orderService;
	}

	@PostMapping
	public ResponseEntity<orderResponse> placedOrder(@RequestBody orderRequest orderRequest)
	{
		orderResponse orderResponse=orderService.placeOrder(orderRequest);
		return new ResponseEntity<orderResponse>(orderResponse, HttpStatus.CREATED);
		
	}
	

}
