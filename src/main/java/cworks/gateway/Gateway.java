/**
 * ============================================================================
 * Project: gateway-app
 * Created: 2016-08-04 20:33:33
 * Class:   cworks.gateway.Gateway
 *
 * Baked with love
 * ============================================================================
 */
package cworks.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class Gateway {

    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

}
