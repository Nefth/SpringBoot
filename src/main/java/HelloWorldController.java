import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!a";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldController.class, args);

    }
}