package transaction.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import transaction.RestApi.Entity.orders;

public interface orderRepository extends JpaRepository<orders, Long> {

}
