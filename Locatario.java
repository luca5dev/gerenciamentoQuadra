
package mapalocacaoquadras;

import java.time.LocalDate;
import java.util.Scanner;

public class Locatario {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public void verificarMaiorIdade(){
       
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - getAnoNascimento();
        
        if (idade > hoje.getDayOfYear()) {
            idade--;
        }
           if (idade > 18){            
            System.out.println("O locatário é maior de 18 anos");
            
        } else {
            int anoDezoitoAnos = this.getAnoNascimento() + 18;
            if (anoDezoitoAnos == hoje.getYear()) {
                System.out.println("O locatário fará 18 anos no ano corrente.");
            }else{
                System.out.println("Não foi possível concluir o cadastro. O locatário é menor de 18 anos.");
                System.exit(0);
            }
        } 
    }
        
    public void cadastrarLocatario(){
        Scanner sc = new Scanner(System.in);
                
        System.out.println("----------CADASTRO DE LOCATARIO----------");
        System.out.print("Digite o nome do locatário: ");
        this.setNome(sc.nextLine());
        System.out.print("Digite o CPF do locatário: ");
        this.setCpf(sc.nextLine());
        System.out.print("Digite o telefone do locatário: ");
        this.setTelefone(sc.nextLine());
        System.out.print("Digite o ano de nascimento do locatário: ");
        this.setAnoNascimento(sc.nextInt());
        sc.nextLine();
        System.out.println("-----------------------------------------");        
        
    }
    
}
