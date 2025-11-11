public class Animal {

    //ENUMS da Classe
    public enum Especie {CACHORRO, GATO}
    public enum Porte {PEQUENO, MEDIO, GRANDE}
    public enum Sexo {MACHO, FEMEA}
    public enum Status {DISPONIVEL, ADOTADO, EM_ANDAMENTO}

    // Atributos da Classe
    private int id;
    private String nome;
    private String raca;
    private int idade;
    private String historicoSaude;
    private String comportamento;
    private String fotos;
    private boolean possuiChip;
    private String localizacao;
    private boolean vacinado;
    private Especie especie;
    private Porte porte;
    private Sexo sexo;
    private Status status;

    //TODO private UsuarioONG ongResponsavel;
    //TODO IMPLEMENTAR ongResponsavel: USUARIO_ONG NO OBJETO ANIMAL

    //Construtor Vazio
    public Animal() {}

    //Construtor com parâmetros
    public Animal (int id, String nome, String raca, int idade, String historicoSaude, String comportamento, String fotos, boolean possuiChip, String localizacao, boolean vacinado, Especie especie, Porte porte, Sexo sexo, Status status /*TODO, UsuarioONG ongResponsavel*/) {

        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.historicoSaude = historicoSaude;
        this.comportamento = comportamento;
        this.fotos = fotos;
        this.possuiChip = possuiChip;
        this.localizacao = localizacao;
        this.vacinado = vacinado;
        this.especie = especie;
        this.porte = porte;
        this.sexo = sexo;
        this.status = status;
        //TODO this.ongResponsavel = ongResponsavel

    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setHistoricoSaude(String historicoSaude) {
        this.historicoSaude = historicoSaude;
    }
    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }
    public void setFotos(String fotos) {
        this.fotos = fotos;
    }
    public void setPossuiChip(boolean possuiChip) {
        this.possuiChip = possuiChip;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    public void setPorte(Porte porte) {
        this.porte = porte;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    //TODO public void setOngResponsavel(UsuarioONG ongResponsavel){
    // this.ongResponsavel = ongResponsavel}


    //GETTERS
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }
    public int getIdade() {
        return idade;
    }
    public String getHistoricoSaude() {
        return historicoSaude;
    }
    public String getComportamento() {
        return comportamento;
    }
    public String getFotos() {
        return fotos;
    }
    public String getStatusChip() {
        return possuiChip ? "Sim" : "Não";
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public String getStatusVacina() {
        return vacinado ? "Sim" : "Não";
    }
    public Especie getEspecie() {
        return especie;
    }
    public Porte getPorte() {
        return porte;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public Status getStatus() {
        return status;
    }

    //TODO public UsuarioONG getOngResponsavel() {
    // return ongResponsavel;
    // }


    void exibiInformacoes(){
        System.out.println("---*---*---*---*---*---*---*---*---");
        System.out.println("Informações do animal");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Raca: " + getRaca());
        System.out.println("Idade: " + getIdade());
        System.out.println("Historico de Saude: " + getHistoricoSaude());
        System.out.println("Comportamento: " + getComportamento());
        System.out.println("Fotos: " + getFotos());
        System.out.println("Possui Chip: " + getStatusChip());
        System.out.println("Localizacao: " + getLocalizacao());
        System.out.println("Vacinado: " + getStatusVacina());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Porte: " + getPorte());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Status: " + getStatus());
        //TODO System.out.println("ONG Responsável: " + getOngResponsavel());

    }
}
