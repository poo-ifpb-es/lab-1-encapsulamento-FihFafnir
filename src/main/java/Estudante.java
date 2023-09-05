class Estudante {
    String nome;
    int matricula;

    public Estudante(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setMatricula(int novaMatricula) {
        this.matricula = novaMatricula;
    }

}