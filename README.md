# Documentation - Hello Again
## *Campus Numérique 2018 - Véronique*
#

## Création du projet

1. Création du dossier de travail
```
    Hello_Again
```
2. Création d'une arborescence de base java
```
    /Hello_Again
        /src
            /main
                /java
                    /hello
```
3. Création du fichier pom.xml à la racine du projet

```java
<?xml version="1.0" encoding="UTF-8"?>
<project>
  <modelVersion>4.0.0</modelVersion>
  <groupId>veronique</groupId>
  <artifactId>hello</artifactId>
  <version>1</version>
  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
</project>
```
Définition des balises utilisées dans le Project Object Model pom.xml :

| Balise | Définition |
|--------| :--------- |
| project | Balise racine de tous les fichiers pom.xml |
| modelVersion | Indique la version de POM utilisée. Bien que cette version ne change pas fréquemment, elle est obligatoire afin de garantir la stabilité d'utilisation.|
| groupId | Permet d'identifier un groupe qui a créé le projet. Cette clé permet d'organiser et de retrouver plus facilement et rapidement le projet.|
| artifactId | Indique un nom unique utilisé pour nommer les artifacts à construire.|
| version | version de l'artifact généré par le projet.|

4. Création des fichiers 



5. Compilation avec Maven

    Se placer à la racine du projet (au niveau du fichier pom.xml) et lancer la commande
    ```
    mvn compile
    ```
    Maven crée un répertoire `target`contenant les classes compilées

6. Création du fichier hello-1.jar avec Maven
    ```
    mvn install
    ```
    Installe les dépendances éventuelles et crée le fichier hello-1.jar

7. Exécute le projet
    ```
    $ java -cp target/hello-1.jar hello.HelloAgain
    ```
    Affiche le résultat du programme
    ```
    Hello again !
    Warf warf warf !
    ```
