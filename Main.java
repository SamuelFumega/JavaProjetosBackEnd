import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String connectkey = "0";
        String connectkeyA = "0";
        String connectkeyB = "0";
        double salary;
        Medicos medicos = new Medicos();
        Paciente pac = new Paciente();
        EspecialMedica especialMedica = new EspecialMedica();
        Convenios convenios = new Convenios();
        Funcionario funcionario = new Funcionario();
        Endereco endereco1 = new Endereco();
        do {
            Menu1();
            connectkey = read.nextLine();

            switch (connectkey) {
                case "1":
                    Menu2();
                    connectkeyA = read.nextLine();
                    switch (connectkeyA) {
                        case "1":
                            System.out.println("Nome do paciente: ");
                            String nome = read.nextLine();
                            pac.setNome(nome);

                            System.out.println("CPF: ");
                            String cpf = read.nextLine();
                            while(cpf.length() != 11){
                                System.out.println("!CPF INVÁLIDO!");
                                cpf = read.nextLine();
                            }
                            pac.setCpf(cpf);

                            System.out.println("RG: ");
                            String rg = read.nextLine();
                            while (rg.length() != 8){
                                System.out.println("!CPF INVÁLIDO!");
                                rg = read.nextLine();
                            }
                            pac.setRg(rg);

                            System.out.println("Sexo: ");
                            String sexo = read.nextLine();
                            pac.setSexo(sexo);

                            System.out.println("Data de nascimento: ");
                            String datanasc = read.nextLine();
                            pac.setDatanasc(datanasc);

                            System.out.println("Endereço do paciente completo: ");
                            System.out.println("Rua:");
                            String rua = read.nextLine();
                            endereco1.setRua(rua);

                            System.out.println("Número da complemento: ");
                            String numero = read.nextLine();
                            int num = Integer.parseInt(numero);
                            endereco1.setNum(num);

                            System.out.println("Bairro: ");
                            String bairro = read.nextLine();
                            endereco1.setBairro(bairro);

                            System.out.println("Cidade: ");
                            String cidade = read.nextLine();
                            endereco1.setCidade(cidade);

                            System.out.println("UF ");
                            String UF = read.nextLine();
                            endereco1.setUF(UF);

                            System.out.println("Telefone: ");
                            String tel = read.nextLine();
                            pac.setTel(tel);
                            pac.setEndereco(endereco1);

                            break;
                        case "2":
                            System.out.println("Nome do médico");
                            nome = read.nextLine();
                            medicos.setNome(nome);

                            System.out.println("CPF: ");
                            cpf = read.nextLine();
                            while(cpf.length() != 11){
                                System.out.println("!CPF INVÁLIDO!");
                                cpf = read.nextLine();
                            }
                            medicos.setCpf(cpf);

                            System.out.println("RG: ");
                            rg = read.nextLine();
                            while (rg.length() != 8){
                                System.out.println("!CPF INVÁLIDO!");
                                rg = read.nextLine();
                            }
                            medicos.setRg(rg);

                            System.out.println("Sexo: ");
                            sexo = read.nextLine();
                            medicos.setSexo(sexo);

                            System.out.println("Data de nascimento: ");
                            datanasc = read.nextLine();
                            medicos.setDatanasc(datanasc);

                            System.out.println("Endereço do paciente completo: ");
                            System.out.println("Rua:");
                            rua = read.nextLine();
                            endereco1.setRua(rua);

                            System.out.println("Número da complemento: ");
                            numero = read.nextLine();
                            num = Integer.parseInt(numero);
                            endereco1.setNum(num);

                            System.out.println("Bairro: ");
                            bairro = read.nextLine();
                            endereco1.setBairro(bairro);

                            System.out.println("Cidade: ");
                            cidade = read.nextLine();
                            endereco1.setCidade(cidade);

                            System.out.println("UF ");
                            UF = read.nextLine();
                            endereco1.setUF(UF);

                            System.out.println("Telefone: ");
                            tel = read.nextLine();
                            medicos.setTel(tel);

                            System.out.println("CRM:");
                            String Crm = read.nextLine();
                            medicos.setCrm(Crm);

                            System.out.println("CRM-UF");
                            String crmuf = read.nextLine();
                            medicos.setCrmuf(crmuf);

                            System.out.println("Especialidade:");
                            String Especialidade = read.nextLine();
                            medicos.setEspecialidade(Especialidade);

                            System.out.println("Código da especialidade");
                            String code = read.nextLine();
                            int cod = Integer.parseInt(code);
                            especialMedica.setCode(cod);

                            System.out.println("Data de cadastro da especialidade");
                            String date = read.nextLine();
                            especialMedica.setDataEspec(date);

                            System.out.println("Descrição da especialidade");
                            String desc = read.nextLine();
                            especialMedica.setDesc(desc);

                            System.out.println("Locais de trabalho da especialidade");
                            String local = read.nextLine();
                            especialMedica.setLocalEspec(local);

                            System.out.println("Salário:" );
                            salary = read.nextDouble();
                            while(salary < 0 ){
                                System.out.println("!SALÁRIO INVÁLIDO!");
                                salary = read.nextDouble();
                            }

                            medicos.setIR(salary);
                            medicos.setSalaryBrute(salary);
                            medicos.setEndereco(endereco1);
                            medicos.setEspecmed(especialMedica);
                            break;
                        case "3":
                            System.out.println("CNPJ:");
                            int cnpj = read.nextInt();
                            convenios.setCnpj(cnpj);

                            System.out.println("Empresa Conveniada:");
                            String EmpConveniada = read.nextLine();
                            convenios.setEmpConveniada(EmpConveniada);

                            System.out.println("Telefone:");
                            String tell = read.nextLine();
                            convenios.setTell(tell);

                            System.out.println("Desconto:");
                            int dscount = read.nextInt();
                            convenios.setDscount(dscount);
                            break;
                        case "4":
                            System.out.println("Nome do funcionário:");
                            nome = read.nextLine();
                            funcionario.setNome(nome);
                            System.out.println("CPF: ");
                            cpf = read.nextLine();
                            while(cpf.length() != 11){
                                System.out.println("!CPF INVÁLIDO!");
                                cpf = read.nextLine();
                            }
                            funcionario.setCpf(cpf);
                            System.out.println("RG: ");
                            rg = read.nextLine();
                            while (rg.length() != 8){
                                System.out.println("!CPF INVÁLIDO!");
                                rg = read.nextLine();
                            }
                            funcionario.setRg(rg);
                            System.out.println("Sexo: ");
                            sexo = read.nextLine();
                            funcionario.setSexo(sexo);
                            System.out.println("Data de nascimento: ");
                            datanasc = read.nextLine();
                            funcionario.setDatanasc(datanasc);
                            System.out.println("Endereço do paciente completo: ");
                            System.out.println("Rua:");
                            rua = read.nextLine();
                            endereco1.setRua(rua);
                            System.out.println("Número da complemento: ");
                            numero = read.nextLine();
                            num = Integer.parseInt(numero);
                            endereco1.setNum(num);
                            System.out.println("Bairro: ");
                            bairro = read.nextLine();
                            endereco1.setBairro(bairro);
                            System.out.println("Cidade: ");
                            cidade = read.nextLine();
                            endereco1.setCidade(cidade);
                            System.out.println("UF ");
                            UF = read.nextLine();
                            endereco1.setUF(UF);
                            System.out.println("Telefone: ");
                            tel = read.nextLine();
                            funcionario.setTel(tel);
                            System.out.println("Registro:");
                            int register = read.nextInt();
                            funcionario.setRegister(register);
                            System.out.println("Função:");
                            String func = read.nextLine();
                            funcionario.setFunc(func);
                            read.nextLine();
                            System.out.println("Salario:");
                            salary = read.nextDouble();
                            while(salary <= 0 ){
                                System.out.println("!SALÁRIO INVÁLIDO!");
                                salary = read.nextDouble();
                            }
                            funcionario.setIR(salary);
                            funcionario.setSalaryBrute(salary);
                            read.nextLine();
                            funcionario.setEndereco(endereco1);
                            break;
                        case "5":

                            break;
                    }
                    break;
                case "2":
                    Menu3();
                    connectkeyB = read.nextLine();
                    switch(connectkeyB){
                        case "1":
                    System.out.println("| 1 -   Paciente(Pessoa Fisica)|");
                    pac.InfoPaciente();
                    break;
                        case "2":
                    System.out.println("| 2 -   Médicos |");
                    medicos.InfoMedicos();
                    break;
                        case "3":
                    System.out.println("| 3 -   Convenios   |");
                    convenios.infoConvenios();
                    break;
                        case "4":
                    System.out.println("| 4 -   Funcionário   |");
                    funcionario.infoFunc();}
                    break;
                case "3":
                    System.out.println("Desconto de salário do funcionário." );
                    System.out.println("Coloque o nome do funcionário:" );
                    String nome = read.next();
                    if(nome == funcionario.getNome()) {
                        System.out.println("Desconto:");
                        System.out.println("O desconto do funcionário" + funcionario.getNome().toUpperCase() + "é de: " + funcionario.getIR());
                    }
                    break;
                case "4":
                    System.out.println("Desconto de salário do médico." );
                    System.out.println("Coloque o nome do médico:" );
                    nome = read.next();
                    if(nome == medicos.getNome()) {
                        System.out.println("Desconto:");
                        System.out.println("O desconto do medico" + medicos.getNome().toUpperCase() + "é de: " + medicos.getIR());
                    }
                    break;
                case "99":
                    System.exit(99);
                    break;
            }
        } while (connectkey != "99");

    }
    public static void Menu1(){
        System.out.println("|Sistema Consultório|");
        System.out.println("|MENU|");
        System.out.println("| 1 - Cadastrar|");
        System.out.println("| 2 -  Mostrar |");
        System.out.println("| 3 -  Descontos dentro do salário do funcionário |");
        System.out.println("| 4 -  Descontos dentro do salário do médico |");
        System.out.println("| 99 -   Sair  |");
    }
    public static void Menu2(){
        System.out.println("|MENU CADASTRO|");
        System.out.println("| 1 -  Paciente(Pessoa Fisica)|");
        System.out.println("| 2 -  Médicos |");
        System.out.println("| 3 -  Convenios   |");
        System.out.println("| 4 -  Funcionário   |");
        System.out.println("| 5 -  Voltar  |");
    }
    public static void Menu3(){
        System.out.println("|MENU AMOSTRAGEM|");
        System.out.println("| 1 -  Paciente(Pessoa Fisica)|");
        System.out.println("| 2 -  Médicos |");
        System.out.println("| 3 -  Convenios   |");
        System.out.println("| 4 -  Funcionário   |");
        System.out.println("| 5 -  Voltar  |");
    }
}
