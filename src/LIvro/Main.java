package LIvro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Livro_const_setget livroConstSetget = new Livro_const_setget();

        // instanciando um array com 3 posições
        Livro_const_setget [] livroConstSetgets = new Livro_const_setget[3];



        // criando um for que será incrementado com os imputs do usuário
        for(int i = 0; i < 3; i ++){
            String titulo, autor;
            int anoPublicacao;
            double preco;
            System.out.println("Digite o Título do livro -> " + (i+1) + ":");
            titulo = sc.nextLine();
            System.out.println("Digite o autor do Livro -> " + (i+1) + ":");
            autor = sc.nextLine();
            System.out.println("Digite o ano de publicação do livro ->" + (i+1)+ ":");
            anoPublicacao = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o preço do livro -> " + (i+1)+ ":");
            preco = sc.nextDouble();
            sc.nextLine();
            livroConstSetgets[i] = new Livro_const_setget(autor, titulo, anoPublicacao, preco);
            System.out.println("***************************************************");

        }
        // imprimindo o todos os dados
        Livro_const_setget.listarLivros(livroConstSetgets);


        // rejustando o preço do livro 1, posição do livro no índice [0]
        System.out.println("Preço do primeiro livro antes do rejuste: " + livroConstSetgets[0].getPreco());
        System.out.println("Rejuste do valor...");
        livroConstSetgets[0].reajustePreco(0.10);
        System.out.println("Reajustado em 10% ");
        System.out.printf("Valor reajustado : %.2f ", livroConstSetgets[0].getPreco());
        sc.nextLine();





        sc.close();
    }


}