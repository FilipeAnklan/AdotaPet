public class PrincipalAnimal {

    public static void main(String[] args) {

    //ANIMAL 1 - PREENCHIDO ATRAVÉS DO CONSTRUTOR COM MÉTODOS
    Animal animal = new Animal(
            1,
            "Flora",
            "Sem Raça definida",
            2,
            "Vacinada e castrada",
            "Muito Dócil e Curiosa",
            "EXEMPLO-FOTO.JPG",
            false,
            "Sabáudia-PR",
            true,
            Animal.Especie.GATO,
            Animal.Porte.PEQUENO,
            Animal.Sexo.FEMEA,
            Animal.Status.DISPONÍVEL);
    Animal animal1 = new Animal();

    //ANIMAL 2 - PREENCHIDO POR MÉTODOS SETS
    animal1.setId(2);
    animal1.setNome("Isis");
    animal1.setRaca("Chow-Chow");
    animal1.setIdade(3);
    animal1.setHistoricoSaude("Vacinada e Castrada");
    animal1.setComportamento("Amorosa e comportada");
    animal1.setFotos("FOTOS-EXEMPLO.JPG");
    animal1.setPossuiChip(false);
    animal1.setLocalizacao("Arapongas-PR");
    animal1.setVacinado(true);
    animal1.setSexo(Animal.Sexo.FEMEA);
    animal1.setEspecie(Animal.Especie.CACHORRO);
    animal1.setPorte(Animal.Porte.GRANDE);
    animal1.setStatus(Animal.Status.DISPONÍVEL);

    //EXIBI INFORMAÇÕES DOS ANIMAIS CADASTRADOS
    animal.exibiInformacoes();
    animal1.exibiInformacoes();

    }
}