package transaction.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import transaction.RestApi.Entity.payment;

public interface paymentRepository extends JpaRepository<payment, Long> {

}
