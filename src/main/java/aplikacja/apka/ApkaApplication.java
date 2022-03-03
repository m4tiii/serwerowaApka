package aplikacja.apka;

import aplikacja.apka.enumeration.Status;
import aplikacja.apka.model.Server;
import aplikacja.apka.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApkaApplication.class, args);
		System.out.println(System.getProperty("user.home") + "/Downloads/image/");

	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepository){

		return args -> {
			serverRepository.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "PersonalPC", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.321", "Microsoft Mysql", "24 GB", "Web Server", "http://localhost:8080/server/image/server2.png", Status.SERVER_DOWN));
			serverRepository.save(new Server(null, "192.168.1.12", "Linux Server", "8 GB", "Test Server", "http://localhost:8080/server/image/server3.png", Status.SERVER_DOWN));
			serverRepository.save(new Server(null, "192.168.1.1", "Windows Server", "64 GB", "Mail Server", "http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
		};
	}

}
