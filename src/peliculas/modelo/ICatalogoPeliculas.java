package peliculas.modelo;

public interface ICatalogoPeliculas {

    void insertarPeliculas(Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);

}
