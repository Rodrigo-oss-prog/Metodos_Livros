# Métodos em Java
## Criando um programa para adicionar dados de livros, muito simples, só para aprender a usar métodos, geters e seters

## Criado um método para reajustar o preço de um livro
````
public void reajustePreco(double porcentagem){
        setPreco(getPreco() * (1+porcentagem));

    }
````
Reajustando na classe Main:
````
livroConstSetgets[0].reajustePreco(0.10);
````
e também outro para listar livros:
````
public static void listarLivros(Livro_const_setget[] livroConstSetgets){

        for (Livro_const_setget livro: livroConstSetgets){
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Preco: " + livro.getPreco());
            System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
            System.out.println("***************************************************");

        }
````
Listando na classe Main:
`````
Livro_const_setget.listarLivros(livroConstSetgets);
`````
