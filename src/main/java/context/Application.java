package context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Configuration
@ComponentScan(basePackages="beans")
public class Application {

    /*@Bean
    MessageService getBeanForSpring() {
        return new MessageService() {
            public String getMessage() {
              return "Hello World!";
            }
        };
    	MessageService service = new MessageServiceImpl();
    	return service;
    }*/

 
}

/*

@Controller
@Service
@Repository
@Component

*/