package transaction.RestApi.Entity;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data

@Getter
@Setter

public class orders {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrderTrackingId() {
		return orderTrackingId;
	}
	public void setOrderTrackingId(String orderTrackingId) {
		this.orderTrackingId = orderTrackingId;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public long getShoppingCartId() {
		return shoppingCartId;
	}
	public void setShoppingCartId(long shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}
	public LocalDateTime getOrderCreated() {
		return orderCreated;
	}
	public void setOrderCreated(LocalDateTime orderCreated) {
		this.orderCreated = orderCreated;
	}
	public LocalDateTime getOrderUpdated() {
		return orderUpdated;
	}
	public void setOrderUpdated(LocalDateTime orderUpdated) {
		this.orderUpdated = orderUpdated;
	}
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY)
	private long id;
	private String orderTrackingId;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private int totalQuantity;
	private String status;
	private BigDecimal totalPrice;
	private long shoppingCartId;
	@CreationTimestamp
	private LocalDateTime orderCreated;
	@UpdateTimestamp
	private LocalDateTime orderUpdated;


}