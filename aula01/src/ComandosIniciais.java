import java.util.Scanner;

public class ComandosIniciais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Comentário de linha
        //Comandos de Entrada, Saída e Processamento
        //Comando de saída -> System.out.print
        System.out.println("Bem vindos ao Shift Java!");
        System.out.print("Digite seu nome: ");

        //Variável de memória => É um espaço na memória RAM para armazenar uma informação
        //tipo nomeDaVariavel;
        int idade; //idade variavel do tipo inteiro
        double salario; // variavel real
        char caracter; //um caracter
        boolean temFilhos; //true ou false
        String nome;

        //Entrada de dados => variavel = leitor.nextTipo;
        nome = leitor.nextLine(); //next() são para textos
        System.out.println("Olá " + nome + "!");
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        System.out.println("Você tem " + idade + " anos.");

        //Processamento
        //Atribuição => variavel = ? (valor | variavel | Calculo
        int x = 10; //x recebe o valor 10, atribuindo 10 à variável x
        int y = 10 * 2; //processamento
        y = 2 * x;

        /*
        * + soma
        * - subtração
        * * multiplicação
        * / divisão
        * % resto da divisão
        * */
        int num = 10, i = 0;
        num += 5; //num = num + 5;
        // += -= *= /= %=
        i++; //i += 1; ou i = i + 1;
        //++ soma 1 na propria variável
        //-- subtrai 1 da propria variavel
        double media = (x + y) / 2;

        /*
        Comentário
        de várias
        linhas
        * */
    }

}
