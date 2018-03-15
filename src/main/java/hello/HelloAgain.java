package hello;

public class HelloAgain {

    public static void main(String[] args) {

        Animal homme = new Human(); // Création d'un objet Human 
        Animal chien = new Dog(); // Création d'un objet Dog à partir de la classe  Animal avec un argument de couleur
        Animal canard = new Duck();

        System.out.println(homme.sayHello()); // Afficher ce que dit l'objet animal1 (Human) avec la méthode sayHello
        System.out.println(chien.sayHello()); // Afficher ce que dit l'objet animal2 (Dog) avec la méthode sayHello
        System.out.println(canard.sayHello());
    }
}