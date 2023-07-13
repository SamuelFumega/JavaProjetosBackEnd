public abstract class PessoaFisica {
    private String  rg;
    private String cpf ,nome, sexo, datanasc;
    private String tel;
    private Endereco endereco;
    private double salary;
    protected  double salaryIR;

    public PessoaFisica(){
    }

    public PessoaFisica(String cpf, String rg, String nome, String sexo, String datanasc,String tel, Endereco endereco ) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.sexo = sexo;
        this.datanasc = datanasc;
        this.tel = tel;
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void infoPessoa(){
        System.out.println("\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nRG: " + rg +
                "\nSexo: " + sexo +
                "\nData de nascimento: " + datanasc +
                "\nTelefone: " + tel +
                "\nRua: " + getEndereco().getRua() +
                "\nNúmero do complemento: " + getEndereco().getNum() +
                "\nBairro: " + getEndereco().getBairro() +
                "\nCidade: " + getEndereco().getCidade() +
                "\nUF: " + getEndereco().getUF());
    }

}
