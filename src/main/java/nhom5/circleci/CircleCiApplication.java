package nhom5.circleci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircleCiApplication {

    public static void main(String[] args) {
        System.out.println("CircleCI");
        SpringApplication.run(CircleCiApplication.class, args);
    }

}
