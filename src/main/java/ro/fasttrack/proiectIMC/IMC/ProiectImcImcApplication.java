package ro.fasttrack.proiectIMC.IMC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrack.proiectIMC.IMC.domain.IMC;
import ro.fasttrack.proiectIMC.IMC.repository.IMCRepository;

import java.util.List;

@SpringBootApplication
public class ProiectImcImcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProiectImcImcApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(IMCRepository repo) {
		return args -> repo.saveAll(List.of(
					new IMC("Ana", 160, 60, 23),
					new IMC("Mihai", 190, 80, 22),
					new IMC("George", 170, 70, 24),
                    new IMC("Andrei",180,80,25)
			));
		}
    }
