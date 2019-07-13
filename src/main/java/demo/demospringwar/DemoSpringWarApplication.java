package demo.demospringwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoSpringWarApplication extends SpringBootServletInitializer {
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoSpringWarApplication.class);
    }



	public static void main(String[] args) {
		SpringApplication.run(DemoSpringWarApplication.class, args);
	}

}


//@SpringBootApplication
//public class DemoSpringWarApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(DemoSpringWarApplication.class, args);
//	}
//
//}
