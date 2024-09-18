import org.classes.Livro;
import org.classes.Biblioteca;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Livro
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("O Morro dos Ventos Uivantes", "Emily Brontë", 1847);
        Livro livro3 = new Livro("1984", "George Orwell", 1949);

        // Criando uma instância de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando os livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Exibindo os detalhes dos livros cadastrados
        biblioteca.exibirLivros();
    }
}

// Atividade da aula 04
// Yan Palmer Andrade Miranda
// Gabriel Gomes de Oliveira Matias