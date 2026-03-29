package ma.ens.issam.springdocker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Classe de test unitaire - Projet Dockerisé par ISSAM
 * Cette classe permet de vérifier que le contexte de l'application
 * se charge correctement sans erreurs de configuration.
 */
@SpringBootTest // Indique à Spring de charger le contexte complet de l'application pour le test
class SpringDockerIssamApplicationTests {

	/**
	 * Test de chargement du contexte (Réalisé par ISSAM)
	 * Si cette méthode s'exécute sans erreur, cela signifie que
	 * l'injection de dépendances et la configuration sont valides.
	 */
	@Test
	void contextLoads() {
		// Ce test est vide car son simple succès confirme
		// que l'application d'ISSAM peut démarrer correctement.
	}

}