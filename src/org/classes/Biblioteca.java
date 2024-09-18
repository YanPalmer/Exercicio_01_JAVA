package org.classes;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Lista para armazenar os objetos Livro
    private List<Livro> livros;

    // Construtor que inicializa a lista de livros
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro à lista
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para exibir os detalhes de todos os livros cadastrados
    public void exibirLivros() {
        for (Livro livro : livros) {
            livro.exibirDetalhes();
        }
    }
}
