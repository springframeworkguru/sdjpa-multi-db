package guruspringframework.sdjpamultidb.repositories.pan;

import guruspringframework.sdjpamultidb.domain.pan.CreditCardPAN;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardPANRepository extends JpaRepository<CreditCardPAN, Long> {
}
