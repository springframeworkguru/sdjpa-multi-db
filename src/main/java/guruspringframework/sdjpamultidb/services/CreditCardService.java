package guruspringframework.sdjpamultidb.services;

import guruspringframework.sdjpamultidb.domain.creditcard.CreditCard;

/**
 * Created by jt on 7/1/22.
 */
public interface CreditCardService {

    CreditCard getCreditCardById(Long id);

    CreditCard saveCreditCard(CreditCard cc);
}
