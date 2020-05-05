package wizut.tpsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"wizut.tpsi"})
public class Lab8Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab8Application.class, args);
    }
}
