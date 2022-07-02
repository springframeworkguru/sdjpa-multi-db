package guruspringframework.sdjpamultidb;

import guruspringframework.sdjpamultidb.domain.creditcard.CreditCard;
import guruspringframework.sdjpamultidb.services.CreditCardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SdjpaMultiDbApplicationTests {

    @Autowired
    CreditCardService creditCardService;

    @Test
    void testSaveAndGetCreditCard() {
        CreditCard cc = CreditCard.builder()
                .firstName("John")
                .lastName("Thompson")
                .zipCode("12345")
                .creditCardNumber("1234556")
                .cvv("123")
                .expirationDate("12/26")
                .build();

        CreditCard savedCC = creditCardService.saveCreditCard(cc);

        assertThat(savedCC).isNotNull();
        assertThat(savedCC.getId()).isNotNull();
        assertThat(savedCC.getCreditCardNumber()).isNotNull();

        CreditCard fetchedCreditCard = creditCardService.getCreditCardById(savedCC.getId());

        assertThat(fetchedCreditCard).isNotNull();
        assertThat(fetchedCreditCard.getId()).isNotNull();
        assertThat(fetchedCreditCard.getCreditCardNumber()).isNotNull();
    }

    @Test
    void contextLoads() {
    }

}
