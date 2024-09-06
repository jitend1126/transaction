package transaction.RestApi.Service;

import transaction.RestApi.Dto.orderRequest;
import transaction.RestApi.Dto.orderResponse;

public interface orderService {
	orderResponse placeOrder(orderRequest orderRequestr);

}
