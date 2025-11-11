public class Principal {

    public static void main(String[] args) {

    Animal animal = new Animal(
            1,
            "Flora",
            "Sem Raça definida",
            2,
            "Vacinada e castrada",
            
            Animal.Especie.GATO,
            Animal.Porte.PEQUENO,

    );
    Animal animal2 = new Animal();
    Animal animal3 = new Animal();

    animal.setNome("Fulano");

    }
}