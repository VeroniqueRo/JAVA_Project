package hello;

public class HelloAgain {
    
    public static void main(String[] args) {

        Animal animal1 = new Human(); // Création d'un objet Human 
        Animal animal2 = new Dog("brown"); // Création d'un objet Dog à partir de la classe  Animal avec un argument de couleur
        
        System.out.println(animal1.sayHello()); // Afficher ce que dit l'objet animal1 (Human) avec la méthode sayHello
        System.out.println(animal2.sayHello()); // Afficher ce que dit l'objet animal2 (Dog) avec la méthode sayHello

    }
}