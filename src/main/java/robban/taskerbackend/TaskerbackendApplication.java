package robban.taskerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "robban.taskerbackend")
public class TaskerbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskerbackendApplication.class, args);
	}

}
