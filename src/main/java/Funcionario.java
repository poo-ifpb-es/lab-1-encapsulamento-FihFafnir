class Funcionario {
    private String nome, sobrenome;
    private float salario;

    public Funcionario(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String novoSobrenome) {
        this.sobrenome = novoSobrenome;
    }

    public float getSalario() {
        return this.salario;
    }
    
    public void setSalario(float novoSalario) {
        this.salario = novoSalario;
    }    

    public float getSalarioAnual() {
        return this.salario * 12;
    }

    public void concederAumento(float valor) {
        this.salario *= (valor * 0.01 + 1);
    }
}