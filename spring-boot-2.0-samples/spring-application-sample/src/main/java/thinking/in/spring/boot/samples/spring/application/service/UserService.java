package thinking.in.spring.boot.samples.spring.application.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import thinking.in.spring.boot.samples.spring.application.model.Male;

@Service
public class UserService {
    @Bean
    public Male male() {
        System.out.println("male ... ");
        return new Male();
    }
}