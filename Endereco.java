public class Endereco {
    private String rua;
    private int num;
    private String bairro;
    private String cidade;
    private String UF;
    public Endereco() {
    }
    public Endereco(String rua, int num, String bairro, String cidade, String UF) {
        super();
        this.rua = rua;
        this.num = num;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUF() {
        return UF;
    }
    public void setUF(String uF) {
        UF = uF;
    }
}
