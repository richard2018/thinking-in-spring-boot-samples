package thinking.in.spring.boot.samples.spring.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import thinking.in.spring.boot.samples.spring.application.model.Male;
import thinking.in.spring.boot.samples.spring.application.model.Person;


@Component
public class MockMybatisConfiguration {
    @Autowired
    Person person;

    @Bean
    public Male male() {
        System.out.println("male1...");
        return new Male(person);
    }

    @Bean
    public Person person() {
        Person p = new Person();
        System.out.println("ddd........ " + p);
        return p;
    }

    @Bean
    public Male male2() {
        System.out.println("male2..." + person);
        return new Male(person);
    }
}
