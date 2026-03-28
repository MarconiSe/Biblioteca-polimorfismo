public abstract class RecursoBiblioteca implements Prestable {
    protected String titulo;
    protected String autor;
    protected boolean prestado;

    public RecursoBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println(titulo + " fue prestado.");
        } else {
            System.out.println(titulo + " ya estaba prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println(titulo + " fue devuelto.");
        } else {
            System.out.println(titulo + " no estaba prestado.");
        }
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    public abstract void mostrarInfo();
}