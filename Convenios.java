public class Convenios {
    private int cnpj;
    private String EmpConveniada;
    private String tell;
    private int dscount;
    public Convenios(){
     }
    public Convenios(int cnpj, String empConveniada, String tell, int dscount) {
        this.cnpj = cnpj;
        this.EmpConveniada = empConveniada;
        this.tell = tell;
        this.dscount = dscount;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    public String getEmpConveniada() {
        return EmpConveniada;
    }
    public void setEmpConveniada(String empConveniada) {
        EmpConveniada = empConveniada;
    }
    public String getTell() {
        return tell;
    }
    public void setTell(String tell) {
        this.tell = tell;
    }
    public int getDscount() {
        return dscount;
    }
    public void setDscount(int dscount) {
        this.dscount = dscount;
    }

    public void infoConvenios(){
        System.out.println("CNPJ da empresa: " + cnpj +
                "Empresa conveniada: " + EmpConveniada +
                "Telefone da empresa: " + tell +
                "Desconto da empresa: " + dscount);
    }
}
