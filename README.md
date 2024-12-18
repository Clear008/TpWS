🏦 # Web Service SOAP Bancaire avec JAX-WS

📋 # Vue d'ensemble

Service web SOAP développé en Java utilisant JAX-WS, offrant des fonctionnalités bancaires essentielles et une architecture client-serveur robuste.

🎯 # Fonctionnalités principales

💱 * Conversion EUR → MAD (Dirham Marocain)
🏦 * Consultation des comptes bancaires
📊 * Liste complète des comptes disponibles

🛠️ Technologies utilisées

Java
JAX-WS (Java API for XML Web Services)
SOAP (Simple Object Access Protocol)
WSDL (Web Services Description Language)
SoapUI (Tests)

📸 Captures d'écran et démonstration
1. Déploiement du Web Service
   Show Image
   Publication du service sur le serveur JAX-WS via Endpoint.publish
2. Analyse du WSDL
   Show Image
   Cette image présente le WSDL (Web Services Description Language) généré automatiquement.
3. Structure de la Requête SOAP - Conversion
   Show Image
   Requête SOAP pour la conversion de devise
4. Structure de la Requête SOAP - Détails Compte
   Show Image
   Requête SOAP pour obtenir les détails d'un compte
5. Structure de la Requête SOAP - Liste Comptes
   Show Image
   Requête SOAP pour récupérer tous les comptes
6. Résultat final
   Show Image
   Console montrant les résultats des opérations
   📥 Installation et Exécution
   Cloner le projet
   bashCopygit clone https://github.com/Clear008/TpWS.git
   cd TpWs
   Compiler le projet
   [Instructions de compilation à ajouter]
   ⚙️ Configuration

Le service est accessible par défaut sur : http://0.0.0.0:2233
WSDL disponible sur : http://0.0.0.0:2233/?wsdl

🧪 Tests
Via SoapUI

Créer un nouveau projet SOAP dans SoapUI
Importer le WSDL (http://0.0.0.0:2233/?wsdl)
Tester les opérations disponibles

👨‍💻 Auteur

Nom: Wissal Leknouch
GitHub: @Clear008