public class Funcionario extends PessoaFisica implements Impostos {
    private int register;
    private double salaryLiq;
    private double salaryBrute;
    private String func;

    public Funcionario(){
        super();
    }

    public Funcionario(String cpf, String rg, String nome, String sexo, String datanasc, String tel, Endereco endereco, int register, double salaryLiq,double salaryBrute, String func) {
        super(cpf, rg, nome, sexo, datanasc, tel, endereco);
        this.register = register;
        this.salaryLiq = salaryLiq;
        this.salaryBrute = salaryBrute;
        this.func = func;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public double getSalaryLiq() {
        return salaryLiq;
    }

    public void setSalaryLiq(double salary) {
        this.salaryLiq = salaryLiq;
    }

    public double getSalaryBrute() {
        return salaryBrute;
    }

    public void setSalaryBrute(double salaryLiq) {
        this.salaryBrute = salaryLiq;
    }

    public void setIR(double salaryLiq) {
        if (salaryLiq <= 1903.98)
        {
            salaryLiq -= faixa1;
        }
        else if (salaryLiq > 1903.98 && salaryLiq <= 2826.65)
        {
            salaryLiq -= faixa2;
        }
        else if (salaryLiq > 2826.66 && salaryLiq <= 3751.05)
        {
            salaryLiq -= faixa3;
        }
        else if( salaryLiq > 3751.06 && salaryLiq <= 4664.68){
            salaryLiq -= faixa4;
        }
        else if(salaryLiq > 4664.69){
            salaryLiq -= faixa5;
        }
        salaryIR = salaryLiq;
    }
    public double getIR() {
        return salaryIR;
    }

    @Override
    public double IR(double salary) {
        return 0;
    }

    public void infoFunc(){
        infoPessoa();
        System.out.println("\nCodigo de registro: " + register +
                "\nFunção: " + func +
                "\nSalário bruto: " + getSalaryBrute() +
                "\nSalário liquido com desconto de impostos: " + getIR());
    }
}
