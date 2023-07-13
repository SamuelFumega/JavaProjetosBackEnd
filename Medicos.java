public class Medicos extends PessoaFisica implements Impostos {
    private String crm, crmuf;
    private String especialidade;
    private double SalaryLiq,SalaryBrute;
    private EspecialMedica especmed;

    public Medicos(){
        super();
    }

    public Medicos(String cpf, String rg, String nome, String sexo, String datanasc, String tel, Endereco endereco, String crm, String crmuf, String especialidade,double SalaryLiq,double SalaryBrute, EspecialMedica especmed) {
        super(cpf, rg, nome, sexo, datanasc, tel, endereco);
        this.crm = crm;
        this.crmuf = crmuf;
        this.especialidade = especialidade;
        this.especmed = especmed;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrmuf() {
        return crmuf;
    }

    public void setCrmuf(String crmuf) {
        this.crmuf = crmuf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public EspecialMedica getEspecmed() {
        return especmed;
    }
    public void setEspecmed(EspecialMedica especmed) {
        this.especmed = especmed;
    }

    public double getSalaryLiq() {
        return SalaryLiq;
    }

    public void setSalaryLiq(double salaryLiq) {
        SalaryLiq = salaryLiq;
    }

    public double getSalaryBrute() {
        return SalaryBrute;
    }

    public void setSalaryBrute(double salaryLiq) {
        SalaryBrute = salaryLiq;
    }

    public void setIR(double SalaryLiq) {
        if (SalaryLiq <= 1903.98)
        {
            SalaryLiq -= faixa1;
        }
        else if (SalaryLiq > 1903.98 && SalaryLiq <= 2826.65)
        {
            SalaryLiq -= faixa2;
        }
        else if (SalaryLiq > 2826.66 && SalaryLiq <= 3751.05)
        {
            SalaryLiq -= faixa3;
        }
        else if( SalaryLiq > 3751.06 && SalaryLiq <= 4664.68){
            SalaryLiq -= faixa4;
        }
        else if(SalaryLiq > 4664.69){
            SalaryLiq -= faixa5;
        }
        salaryIR = SalaryLiq;
    }
    public double getIR() {
        return salaryIR;
    }
    @Override
    public double IR(double salary) {
        return 0;
    }
    public void InfoMedicos(){
        infoPessoa();
        System.out.println("CRM: " + crm +
                "\nCRM-UF: " + crmuf +
                "\nEspecialidade: " + especialidade +
                "\nCódigo da Especialidade: " + getEspecmed().getCode() +
                "\nData da Especialidade: " + getEspecmed().getDataEspec() +
                "\nDescrição da Especialidade: " + getEspecmed().getDesc() +
                "\nLocal da especialidade: " + getEspecmed().getLocalEspec() +
                "\nSalário bruto: " + getSalaryBrute() +
                "\nSalário liquido com desconto de impostos: " + getIR());
    }
}


