package org.semana01.modelos;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionLibros {
    private ArrayList<Libro> coleccion;

    public ColeccionLibros() {
        coleccion = new ArrayList<>();
    }

    // Método para agregar libros a la colección
    public void agregarLibro(Libro libro) {
        coleccion.add(libro);
    }

    // Obtener la cantidad de libros con más de 500 páginas
    public int esMas500() {
        int contador = 0;
        // Recorremos cada libro en la colección
        for (Libro libro : coleccion) {
            // Si el libro tiene más de 500 páginas, incrementamos el contador
            if (libro.getPaginas() > 500) {
                contador++;
            }
        }
        return contador; // Devolvemos el número total de libros con más de 500 páginas
    }

    // Obtener la cantidad de libros con menos de 300 páginas
    public int esMenos300() {
        int contador = 0;
        // Recorremos cada libro en la colección
        for (Libro libro : coleccion) {
            // Si el libro tiene menos de 300 páginas, incrementamos el contador
            if (libro.getPaginas() < 300) {
                contador++;
            }
        }
        return contador; // Devolvemos el número total de libros con menos de 300 páginas
    }

    // Listar los títulos de los libros con más de 500 páginas
    public void tituloEsMas500() {
        // Recorremos cada libro en la colección
        for (Libro libro : coleccion) {
            // Si el libro tiene más de 500 páginas, mostramos su título
            if (libro.getPaginas() > 500) {
                System.out.println(libro.getTitulo());
            }
        }
    }

    // Obtener los tres libros con más páginas
    public ArrayList<Libro> obtenerTresLibrosConMasPaginas() {
        ArrayList<Libro> librosLargos = new ArrayList<>();
        // Creamos una copia de la lista original para modificarla sin afectar a la original
        ArrayList<Libro> copiaLibros = new ArrayList<>(coleccion);

        // Encontrar los tres libros con más páginas
        for (int i = 0; i < 3; i++) {
            if (copiaLibros.isEmpty()) {
                break;  // Si no quedan libros, salimos del bucle
            }

            // Encontrar el libro con más páginas
            Libro libroConMasPaginas = copiaLibros.get(0);
            for (Libro libro : copiaLibros) {
                // Comparar el número de páginas para encontrar el mayor
                if (libro.getPaginas() > libroConMasPaginas.getPaginas()) {
                    libroConMasPaginas = libro;
                }
            }

            // Añadir el libro con más páginas a la lista de resultados
            librosLargos.add(libroConMasPaginas);
            // Eliminar ese libro de la copia para que no se vuelva a contar
            copiaLibros.remove(libroConMasPaginas);
        }
        return librosLargos; // Devolver los tres libros con más páginas
    }

    // Obtener la suma total de páginas de todos los libros
    public int sumaPaginas() {
        int contador = 0;
        // Sumar el número de páginas de cada libro
        for (Libro libro : coleccion) {
            contador += libro.getPaginas();
        }
        return contador; // Devolver la suma total
    }

    // Obtener los libros que están por encima del promedio de páginas
    public ArrayList<Libro> librosEncimaDelPromedioDePaginas() {
        int promedio = 0;
        // Primero sumamos todas las páginas
        for (Libro libro : coleccion) {
            promedio += libro.getPaginas();
        }
        // Luego calculamos el promedio
        promedio = promedio / coleccion.size();

        ArrayList<Libro> librosPromedio = new ArrayList<>();
        // Recorremos cada libro y agregamos los que están por encima del promedio
        for (Libro libro : coleccion) {
            if (libro.getPaginas() > promedio)
                librosPromedio.add(libro);
        }
        return librosPromedio; // Devolvemos la lista de libros que superan el promedio
    }

    // Obtener los autores sin repetir
    public ArrayList<String> obtenerAutoresSinRepetir() {
        ArrayList<String> listaAutores = new ArrayList<>();
        // Recorremos cada libro en la colección
        for (Libro libro : coleccion) {
            // Comprobamos si el autor ya está en la lista
            if (!listaAutores.contains(libro.getAutor())) {
                listaAutores.add(libro.getAutor()); // Si no está, lo añadimos
            }
        }
        return listaAutores; // Devolvemos la lista de autores únicos
    }

    // Obtener los autores con más de un libro listado
    public ArrayList<String> obtenerAutoresConMasLibros() {
        ArrayList<String> listaAutores = new ArrayList<>();
        // Recorremos la colección de libros
        for (int x = 0; x < coleccion.size(); x++) {
            String autor = coleccion.get(x).getAutor();
            // Verificamos si el autor tiene más de un libro
            for (int y = x + 1; y < coleccion.size(); y++) {
                if (coleccion.get(y).getAutor().equals(autor) && !listaAutores.contains(autor)) {
                    listaAutores.add(autor); // Si es el caso, lo añadimos a la lista
                }
            }
        }
        return listaAutores; // Devolvemos la lista de autores con más de un libro
    }

    // Obtener el libro con más páginas
    public Libro obtenerLibroMasLargo() {
        Libro libroLargo = new Libro();
        int contaPaginas = 0;
        // Recorremos cada libro en la colección
        for (Libro libro : coleccion) {
            // Si el libro tiene más páginas que el valor actual, lo guardamos
            if (libro.getPaginas() > contaPaginas) {
                libroLargo = libro;
                contaPaginas = libro.getPaginas(); // Actualizamos el número de páginas más alto
            }
        }
        return libroLargo; // Devolvemos el libro con más páginas
    }

    // Obtener todos los títulos de los libros
    public ArrayList<String> obtenerTitulos() {
        ArrayList<String> listaTitulos = new ArrayList<>();
        // Añadimos el título de cada libro a la lista
        for (Libro libro : coleccion) {
            listaTitulos.add(libro.getTitulo());
        }
        return listaTitulos; // Devolvemos la lista de títulos
    }

    // Ordenar los libros alfabéticamente por título
    public void ordenarLibrosAlfabeticamente() {
        Collections.sort(coleccion); // Usamos el método sort de la clase Collections
    }
}
