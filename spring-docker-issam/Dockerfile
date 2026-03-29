# Issam : Étape 1 - Image de base Java (Temurin 17)
FROM eclipse-temurin:17-jdk-jammy

# Issam : Étape 2 - Définition du répertoire de travail interne
WORKDIR /app

# Issam : Étape 3 - Copie du JAR personnalisé (Vérifie bien le nom exact de ton JAR dans /target)
COPY target/spring-docker-issam-0.0.1-SNAPSHOT.jar app.jar

# Issam : Étape 4 - Exposition du port spécifique (8083 au lieu de 8080)
EXPOSE 8083

# Issam : Étape 5 - Commande de lancement de l'application
ENTRYPOINT ["java", "-jar", "app.jar"]