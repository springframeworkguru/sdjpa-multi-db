package guruspringframework.sdjpamultidb.repositories.creditcard;

import guruspringframework.sdjpamultidb.domain.creditcard.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
