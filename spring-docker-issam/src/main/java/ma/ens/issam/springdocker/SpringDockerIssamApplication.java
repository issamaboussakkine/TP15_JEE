package ma.ens.issam.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Annotation principale de Spring Boot.
 * Elle active la configuration automatique, le scan des composants
 * et permet à l'application de démarrer sans serveur externe.
 */
@SpringBootApplication
public class SpringDockerIssamApplication {

	public static void main(String[] args) {
		/**
		 * Lance l'application Spring Boot.
		 * Cette ligne initialise le contexte Spring et démarre
		 * le serveur Web embarqué (Tomcat) sur le port défini.
		 */
		SpringApplication.run(SpringDockerIssamApplication.class, args);
	}

}