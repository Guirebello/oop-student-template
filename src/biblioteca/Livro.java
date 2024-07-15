package biblioteca;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String isbn;
    boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.emprestado = false;
    }

    public void emprestar(){
        if (emprestado) {
            System.out.println("Livro já emprestado");
        } else {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso");
        }
    }

    public void devolver(){
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso");
        } else {
            System.out.println("Livro não está emprestado");
        }
    }

    public boolean emprestando(){
        return emprestado;
    }
}

