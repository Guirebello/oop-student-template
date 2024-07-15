package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    // propriedades
    ArrayList<Livro> acervo = new ArrayList<Livro>();
    
    // métodos
    // construtor
    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    // melhorar usando Exeptions (ver cod do prof)
    void removerLivro(String isbn) {
        for (Livro livro : acervo) {
            if (isbn.equals(livro.isbn)) {
                acervo.remove(livro);
            }
        }
    }
    
    ArrayList<Livro> listaEmprestados(){
        var emprestados = new ArrayList<Livro>();
        for (var livro : acervo) {
            if (livro.emprestando()) {
                emprestados.add(livro);
            }
        }
        return emprestados;
    }

    ArrayList<Livro> listaDisponiveis(){
        var disponiveis = new ArrayList<Livro>();
        for (var livro : acervo) {
            if (!livro.emprestando()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }
}
