package guruspringframework.sdjpamultidb.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 7/1/22.
 */
@Configuration
public class FlywayConfiguration {

    @Bean
    @ConfigurationProperties("spring.card.flyway")
    public DataSourceProperties cardFlywayDataSourceProps(){
        return new DataSourceProperties();
    }

    @Bean(initMethod = "migrate")
    public Flyway flywayCard(@Qualifier("cardFlywayDataSourceProps")
                             DataSourceProperties cardFlywayDataSourceProps){
        return Flyway.configure()
                .dataSource(cardFlywayDataSourceProps.getUrl(),
                        cardFlywayDataSourceProps.getUsername(),
                        cardFlywayDataSourceProps.getPassword())
                .locations("classpath:/db/migration/card")
                .load();
    }

    @Bean
    @ConfigurationProperties("spring.cardholder.flyway")
    public DataSourceProperties cardholderFlywayDataSourceProps(){
        return new DataSourceProperties();
    }

    @Bean(initMethod = "migrate")
    public Flyway flywayCardHolder(@Qualifier("cardholderFlywayDataSourceProps")
                                       DataSourceProperties cardholderFlywayDataSourceProps){
        return Flyway.configure()
                .dataSource(cardholderFlywayDataSourceProps.getUrl(),
                        cardholderFlywayDataSourceProps.getUsername(),
                        cardholderFlywayDataSourceProps.getPassword())
                .locations("classpath:/db/migration/cardholder")
                .load();
    }

    @Bean
    @ConfigurationProperties("spring.pan.flyway")
    public DataSourceProperties panFlywayDataSourceProps(){
        return new DataSourceProperties();
    }

    @Bean(initMethod = "migrate")
    public Flyway flywayPan(@Qualifier("panFlywayDataSourceProps")
                                DataSourceProperties panFlywayDataSourceProps){
        return Flyway.configure()
                .dataSource(panFlywayDataSourceProps.getUrl(),
                        panFlywayDataSourceProps.getUsername(),
                        panFlywayDataSourceProps.getPassword())
                .locations("classpath:/db/migration/pan")
                .load();
    }
}
