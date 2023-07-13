public class Paciente extends PessoaFisica {
    private int codPaciente;

    public Paciente() {
        super();
    }


    public Paciente(String cpf, String rg, String nome, String sexo, String datanasc, String tel, Endereco endereco, int codPaciente) {
        super(cpf, rg, nome, sexo, datanasc, tel, endereco);
        this.codPaciente = codPaciente;
    }

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public void InfoPaciente() {
        System.out.println(" \nCodPaciente: " + codPaciente );
        infoPessoa();
    }
}
