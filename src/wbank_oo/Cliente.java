package wbank_oo;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome, String cpf, String profissao) {
        System.out.println("wbank_oo.Cliente cadastrado com sucesso!");
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "\nDados do wbank_oo.Cliente:\n" +
                "Nome: " + nome +
                "\ncpf: " + cpf +
                "\nProfissao: " + profissao;
    }
}

