package LIvro;

public class Livro_const_setget {
    private String titulo;
    private  String autor;
    private int anoPublicacao;
    private double preco;

    public Livro_const_setget() {
    }

    public Livro_const_setget(String titulo, String autor, int anoPublicacao, double preco) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnoPublicacao(anoPublicacao);
        this.setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void reajustePreco(double porcentagem){
        setPreco(getPreco() * (1+porcentagem));

    }
    public static void listarLivros(Livro_const_setget[] livroConstSetgets){

        for (Livro_const_setget livro: livroConstSetgets){
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Preco: " + livro.getPreco());
            System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
            System.out.println("***************************************************");

        }
    }
}
