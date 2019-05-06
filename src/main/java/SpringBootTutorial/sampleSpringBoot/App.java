package SpringBootTutorial.sampleSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
public class App 
{

	@Autowired
	DemoService demoService;
	
	public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    
    @RequestMapping("/hello")
    public String sayHello() {
    	return "Hello World !!!!";
    }
    
    
}
