package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    private void test() {
		System.out.println("Esta funcion hará algo en el futuro....");

	}
    
private void HelloWorld() {
	// TODO Auto-generated method stub
System.out.println("The task number 6 change");
}
    
}
