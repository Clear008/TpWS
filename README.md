🏦 Web Service SOAP Bancaire avec JAX-WS
📋 Vue d'ensemble
Service web SOAP développé en Java utilisant JAX-WS, offrant des fonctionnalités bancaires essentielles et une architecture client-serveur robuste.
🎯 Fonctionnalités principales

💱 Conversion EUR → MAD (Dirham Marocain)
🏦 Consultation des comptes bancaires
📊 Liste complète des comptes disponibles

🛠️ Technologies utilisées

Java
JAX-WS (Java API for XML Web Services)
SOAP (Simple Object Access Protocol)
WSDL (Web Services Description Language)
SoapUI (Tests)

1️⃣ Déploiement du Web Service
<img src="Images/Capture1.PNG">
Publication du service sur le serveur JAX-WS via Endpoint.publish

2️⃣ Analyse du WSDL
<img src="Images/Capture2.png">
Cette image présente le WSDL (Web Services Description Language) généré automatiquement.

3️⃣ Structure de la Requête SOAP
<img src="Images/Capture3.PNG">
Requête SOAP pour la conversion de devise

3️⃣ Structure de la Requête SOAP
<img src="Images/Capture4.PNG">
Requête SOAP pour obtenir les détails d'un compte

3️⃣ Structure de la Requête SOAP
<img src="Images/Capture5.PNG">
Requête SOAP pour récupérer tous les comptes

3️⃣ Resultat final
<img src="Images/Capture6.PNG">
Console montrant les résultats des opérations


📥 Installation et Exécution
Cloner le projet :
git clone https://github.com/Clear008/TpWS.git
cd TpWs

Compiler le projet 

Configuration

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
