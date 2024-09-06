package transaction.RestApi.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import transaction.RestApi.Entity.orders;
import transaction.RestApi.Entity.payment;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class orderRequest {
	public orders getOrder() {
		return order;
	}
	public void setOrder(orders order) {
		this.order = order;
	}
	public payment getPayment() {
		return payment;
	}
	public void setPayment(payment payment) {
		this.payment = payment;
	}
	private orders order;
	private payment payment;

}
