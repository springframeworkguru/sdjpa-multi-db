package guruspringframework.sdjpamultidb.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 7/1/22.
 */
@Configuration
public class CardHolderDatabaseConfiguration {

    @Bean
    @ConfigurationProperties("spring.cardholder.datasource")
    public DataSourceProperties cardHolderDataSourceProperties(){
        return new DataSourceProperties();
    }

}
