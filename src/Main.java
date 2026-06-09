import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Ola, bem vindo!");
            System.out.println("Qual e o seu nome?");
            Scanner sc = new Scanner(System.in);
            String nome = sc.nextLine();
            System.out.println("Ola," + nome);
            System.out.println("Para dar continuidade preciso de alguma informaçoes ");
            System.out.println("Poderia me informa Seu Cpf?");
            String cpf = sc.nextLine();
            System.out.println("Agora a sua idade");
            int idade = sc.nextInt();
            System.out.println("Seu peso");
            double peso = sc.nextDouble();
            System.out.println("Seu altura");
            float altura = sc.nextFloat();
            System.out.println("Seu estado civil");
            String estadoCivil = sc.next();

            double imc = peso / (altura * altura);

            System.out.println("Resumo das informações:\n" +
                    "Seu nome é: " + nome + "\n" +
                    "Seu CPF é: " + cpf + "\n" +
                    "Sua idade é: " + idade + "\n" +
                    "Seu peso é: " + peso + "\n" +
                    "Sua altura é: " + altura + "\n" +
                    "Seu estado civil é: " + estadoCivil + "\n" +
                    "Seu IMC é: " + imc);









        }


}
