public class LivroEncapsulamento {
    private static class Livro {
        private String titulo;
        private String autor;
        private int paginas;

        public void setTitulo(String titulo) { this.titulo = titulo; }
        public void setAutor(String autor) { this.autor = autor; }
        public void setPaginas(int paginas) { this.paginas = paginas; }

        public void exibirDetalhes() {
            System.out.println("Titulo: " + titulo + "|Autor: " + autor + "|Paginas: " + paginas);
        }
    }

    public static void main(String[] args) {
        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("Livro");
        primeiroLivro.setAutor("Igor");
        primeiroLivro.setPaginas(800);

        Livro segundoLivro = new Livro();
        segundoLivro.setTitulo("Livro3");
        segundoLivro.setAutor("Igor2");
        segundoLivro.setPaginas(600);

        primeiroLivro.exibirDetalhes();
        segundoLivro.exibirDetalhes();
    }
}
