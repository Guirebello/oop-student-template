package biblioteca;

public class App {
    public static void main(String[] args) {
        var biblioteca = new Biblioteca();
        
        Livro livro1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, "978-85-325-2922-0");
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 1937, "978-85-325-2922-1");
        Livro livro3 = new Livro("O Silmarillion", "J. R. R. Tolkien", 1977, "978-85-325-2922-2");
        Livro livro4 = new Livro("O Código da Vinci", "Dan Brown", 2003, "978-85-325-2922-3");
        Livro livro5 = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997, "978-85-325-2922-4");
        Livro livro6 = new Livro("Harry Potter e a Câmara Secreta", "J. K. Rowling", 1998, "978-85-325-2922-5");
        Livro livro7 = new Livro("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 1999, "978-85-325-2922-6");
        Livro livro8 = new Livro("Harry Potter e o Cálice de Fogo", "J. K. Rowling", 2000, "978-85-325-2922-7");
        Livro livro9 = new Livro("Harry Potter e a Ordem da Fênix", "J. K. Rowling", 2003, "978-85-325-2922-8");
        Livro livro10 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, "978-85-325-2922-11");
        
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);
        biblioteca.adicionarLivro(livro7);
        biblioteca.adicionarLivro(livro8);
        biblioteca.adicionarLivro(livro9);
        biblioteca.adicionarLivro(livro10);

        livro1.emprestar();
        livro2.emprestar();
        livro3.emprestar();
        livro1.devolver();

        System.out.println("Livros emprestados:");
        for(var livro : biblioteca.listaEmprestados()){
            System.out.println(livro.titulo);
        }

        System.out.println();

        System.out.println("Livros disponíveis:");
        for(var livro : biblioteca.listaDisponiveis()){
            System.out.println(livro.titulo);
        }

    }
}
