package thinking.in.spring.boot.samples.spring.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import thinking.in.spring.boot.samples.spring.application.model.Person;


@Configuration
public class MockMybatisConfiguration {

    @Bean
    public Person person() {
        System.out.println("ddd........");
        return new Person();
    }
}
