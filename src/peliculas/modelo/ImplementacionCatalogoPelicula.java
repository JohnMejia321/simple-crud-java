package peliculas.modelo;

import javax.swing.*;
import java.util.ArrayList;

public class ImplementacionCatalogoPelicula implements ICatalogoPeliculas {

    private final ArrayList<String> listaPeliculas;

    public ImplementacionCatalogoPelicula() {
        this.listaPeliculas = new ArrayList<>();
    }

    @Override
    public void insertarPeliculas(Pelicula nombrePelicula) {
        this.listaPeliculas.add(nombrePelicula.toString());

    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(null,
                this.listaPeliculas,"LISTADO DE PELICULAS",2);

    }


    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;
        for (var pelicula : this.listaPeliculas) {
            if (pelicula.equals(nombrePelicula)) {
                resultado = pelicula;
                break;
            } else {
                resultado = pelicula;
            }
        }

        if (nombrePelicula.equals(resultado)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Resultado ->" + resultado,
                    "BUSCAR PELICULA",
                    JOptionPane.QUESTION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No se encontro la Pelicula ->" + nombrePelicula,
                    "BUSCAR PELICULA",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}
