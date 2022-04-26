package models;

public class Aluno {

    private String nome;
    private String cpf;
    private int dataNascimento;
    private String endereco;
    private int telefone;
    private int telefoneEmergencia;
    

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTefefoneEmergencia() {
        return telefoneEmergencia;
    }
    public void setTefefoneEmergencia(int tefefoneEmergencia) {
        this.telefoneEmergencia = tefefoneEmergencia;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return 
            "Nome: " + nome + 
            " | CPF: " + cpf +
            "| Data de Nascimento: " + dataNascimento +
            " | Endereço: " + endereco +
            "| Telefone: " + telefone +
            "| Telefo de Emergência: " + telefoneEmergencia;


    }

    public void add(Aluno aluno) {
    }
    
}
