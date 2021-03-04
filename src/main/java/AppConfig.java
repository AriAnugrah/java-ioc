import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Autowired
    private Dog dog;

    @Autowired
    private Cat cat;

    @Bean
    Dog dog(){
        return new Dog();
    }

    @Bean
    Cat cat(){
        return new Cat();
    }

    @Bean
    Ari ari(){
        return new Ari(cat,dog);
    }
}
