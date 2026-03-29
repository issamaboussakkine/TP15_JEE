# 🍃 Projet Spring Boot Dockerisé - ISSAM

## 📝 Description du Projet
Ce projet consiste en la conteneurisation d'une application **Spring Boot (v3.5.14)** connectée à une base de données **MySQL 8.0**, orchestrée par **Docker Compose**. L'interface **phpMyAdmin** est également intégrée pour faciliter la gestion des données.

**Auteur :** ISSAM ABOUSSAKKINE

---

## 🏗️ Architecture des Services
L'infrastructure utilise trois conteneurs distincts communiquant sur un réseau bridge Docker :

| Service | Image | Port | Description |
| :--- | :--- | :--- | :--- |
| **spring-app-issam** | ens/spring-docker-issam:1.0 | `8083` | Application Backend Java |
| **mysql-db-issam** | mysql:8.0 | `3307` | Base de données MySQL |
| **phpmyadmin-issam** | phpmyadmin:latest | `8084` | Interface d'administration SQL |

---

## 🚀 Guide de Lancement (Commandes ISSAM)

### 1. Démarrage de l'infrastructure

docker-compose up -d

<img width="1281" height="148" alt="Capture d&#39;écran 2026-03-29 200510(1)" src="https://github.com/user-attachments/assets/eb2cfa6b-af14-47c8-bca4-8c0664df8497" />

### 2. Vérification de l'état des conteneurs

docker ps

<img width="1676" height="135" alt="Capture d&#39;écran 2026-03-29 200418 - Copie" src="https://github.com/user-attachments/assets/83f70942-f7ff-4231-8bdb-bd0104cb3651" />

### 3. Consultation des Logs (Validation Connexion DB)

docker logs -f spring-app-issam

<img width="1865" height="825" alt="Capture d&#39;écran 2026-03-29 200544" src="https://github.com/user-attachments/assets/479afb71-fb13-48a7-97df-95adeb15ee55" />

<img width="1820" height="814" alt="Capture d&#39;écran 2026-03-29 200529" src="https://github.com/user-attachments/assets/76ef9963-6eff-4e5e-881d-fdf9bfb3b750" />

🔍 Validation du Fonctionnement

🖥️ Accès Application

    URL : http://localhost:8083

    Résultat : L'affichage de la page Whitelabel Error (404) confirme que le serveur Spring Boot est opérationnel et répond aux requêtes sur le port 8083.
    
<img width="1865" height="963" alt="image" src="https://github.com/user-attachments/assets/35254069-010e-49ed-bd16-dbb844b3057f" />


🗃️ Administration Base de Données

    URL : http://localhost:8084

    Base : issam_demo_db

<img width="1919" height="962" alt="Capture d&#39;écran 2026-03-29 193110" src="https://github.com/user-attachments/assets/b9026588-7add-475e-a2f8-c1ed475c1785" />



