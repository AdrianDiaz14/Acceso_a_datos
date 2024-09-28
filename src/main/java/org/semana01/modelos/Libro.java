package org.semana01.modelos;

public class Libro implements Comparable<Libro> {
    // Atributos de la clase Libro
    String isbn;  // Código ISBN único para identificar el libro
    String titulo;  // Título del libro
    String autor;  // Nombre del autor del libro
    int paginas;  // Número de páginas del libro

    // Constructor por defecto (vacío)
    public Libro() {
    }

    // Constructor que inicializa todos los atributos de un libro
    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;  // Inicializamos el ISBN del libro
        this.titulo = titulo;  // Inicializamos el título del libro
        this.autor = autor;  // Inicializamos el autor del libro
        this.paginas = paginas;  // Inicializamos el número de páginas del libro
    }

    // Getter para obtener el ISBN del libro
    public String getIsbn() {
        return isbn;
    }

    // Setter para modificar el ISBN del libro
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter para obtener el título del libro
    public String getTitulo() {
        return titulo;
    }

    // Setter para modificar el título del libro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para obtener el autor del libro
    public String getAutor() {
        return autor;
    }

    // Setter para modificar el autor del libro
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter para obtener el número de páginas del libro
    public int getPaginas() {
        return paginas;
    }

    // Setter para modificar el número de páginas del libro
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Método que implementa la interfaz Comparable para ordenar libros alfabéticamente
    @Override
    public int compareTo(Libro o) {
        // Comparamos el título de este libro con el título de otro libro usando el método compareTo de String
        // Si this.titulo es alfabéticamente menor, devuelve un número negativo
        // Si son iguales, devuelve 0
        // Si this.titulo es mayor, devuelve un número positivo
        return this.titulo.compareTo(o.titulo);
    }
}
