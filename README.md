######################### DESCRIPTION GENERALE DU PROJET ################################

Le but des tp 2 et 4 est de concevoir et réaliser une sorte de réseau social permettant à des personnes qui sont amies de partager des données relatives à leurs consommations électriques. Dans la première partie du projet (tp2), il s'agit d'une application développée en local. La partie 2 du projet consiste en développer une application web REST, avec le serveur TomCat.


########################## INSTALLATION DU PROJET  ########################################
Pour faire fonctionner le projet, il faut:
- Importer le projet en tant que projet Maven après l'avoir téléchargé
- Ouvrir hsqldb (en exécutant le fichier show-hsqldb puis run-hsqldb-server
- Exécuter la classe testJPA pour peupler la base de données hsqldb
- Exécuter le projet en tant que projet Maven et mettre dans goal: tomcat7:run . Dans notre cas, le port est 9000
- Aller dans votre navigateur et saisir : http://localhost::9000 et cela vous menera à la page d'accueil qui comporte 3 liens. Ceux permettent de créer une personne, une maison et un équipement.

Nous avons réalisé les autres classes ou consignes du TP4.Pour y accéder:
- http://localhost::9000/rest/hello
- http://localhost::9000/rest/hello/home

################## Question 6.  Mise en évidence du problème de n+1 select. (TP2) #########################

Lorsque que nous lançons la classe N1Select, nous notons que l'exécution de la requête dure 17 secondes. En effet, il est question de recupérer la liste des noms des différents employés de tous les départements. Dans cette requête, le select de la liste de départements est réalisé pour chaque employé. L'avantage ici est que seul les département qui contienne des employés seront sélectionné.

Avec JoinFetch, la liste des départements est préchargée, ce qui fait que la requête est exécutée en moins de temps (3 secondes). Donc dans ce cas le JoinFetch est plus performant que la première méthode. Cette méthode peut ne pas être performante dans le cas où il y a une vraie masse de données et pas assez de mémoire pour précharger.


