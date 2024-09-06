package transaction.RestApi.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class orderResponse {
	private String orderTrackingNo;
	private String message;
	public String getOrderTrackingNo() {
		return orderTrackingNo;
	}
	public void setOrderTrackingNo(String orderTrackingNo) {
		this.orderTrackingNo = orderTrackingNo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String status;

}
