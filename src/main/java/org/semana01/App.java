package org.semana01;

import org.semana01.modelos.ColeccionLibros;
import org.semana01.modelos.Libro;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Creamos una instancia de ColeccionLibros, que contendrá la lista de libros
        ColeccionLibros coleccion = new ColeccionLibros();

        // Agregamos varios libros a la colección usando el método agregarLibro()
        // Cada libro se instancia con su ISBN, título, autor y número de páginas
        coleccion.agregarLibro(new Libro("9788422616337", "El Señor de los Anillos", "J.R.R. Tolkien", 800));
        coleccion.agregarLibro(new Libro("9788445077528", "El Hobbit", "J.R.R. Tolkien", 350));
        coleccion.agregarLibro(new Libro("9788466316781", "Cabo Trafalgar", "Arturo Pérez Reverte", 320));
        coleccion.agregarLibro(new Libro("9788493975074", "El corazón de la piedra", "José María García López", 560));
        coleccion.agregarLibro(new Libro("9788493291488", "Salmos de vísperas", "Esteban Hernández Castelló", 95));
        coleccion.agregarLibro(new Libro("9788420685625", "La música en las catedrales españolas del Siglo de Oro", "Robert Stevenson", 600));
        coleccion.agregarLibro(new Libro("9788423913077", "Luces de bohemia", "Ramón del Valle-Inclán", 296));
        coleccion.agregarLibro(new Libro("9788448031121", "Contando atardeceres", "La vecina rubia", 528));
        coleccion.agregarLibro(new Libro("9781529342079", "The Master: The Brilliant Career of Roger Federer", "Christopher Clarey", 456));
        coleccion.agregarLibro(new Libro("9788408264385", "La teoría de los archipiélagos", "Alice Kellen", 300));
        coleccion.agregarLibro(new Libro("9788423362479", "Esperando al diluvio", "Dolores Redondo", 576));
        coleccion.agregarLibro(new Libro("9788466367349", "El italiano", "Arturo Pérez Reverte", 400));
        coleccion.agregarLibro(new Libro("9788466359290", "Línea de fuego", "Arturo Pérez Reverte", 688));

        // Ordenamos los libros alfabéticamente por título usando el método ordenarLibrosAlfabeticamente()
        // Este método usa el compareTo implementado en la clase Libro
        coleccion.ordenarLibrosAlfabeticamente();
        
    }
}
