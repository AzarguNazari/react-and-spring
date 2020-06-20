package no.kantega.springandreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAndReactApplication implements ApplicationRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringAndReactApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		User user1 = new User();
		user1.setName("jamshid");

		User user2 = new User();
		user2.setName("kamal");
		userRepository.save(user1);
		userRepository.save(user2);
		System.out.println(userRepository.findAll());
	}
}
