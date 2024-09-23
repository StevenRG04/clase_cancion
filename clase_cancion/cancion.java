public class Cancion {
    private String titulo;
    private String artista;
    private int duracion; 
    private String genero;
    private String album;

    private static final int SEGUNDOS_POR_MINUTO = 60;

    public Cancion() {
        this.titulo = "Desconocido";
        this.artista = "Desconocido";
        this.duracion = 0;
        this.genero = "Desconocido";
        this.album = "Desconocido";
    }

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = "Desconocido";  
        this.album = "Desconocido";   
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    private int calcularDuracionMinutos() {
        return duracion / SEGUNDOS_POR_MINUTO;
    }

    public void mostrarInformacion() {
        System.out.printf("Título: %s%nArtista: %s%nDuración: %d minutos%nGénero: %s%nÁlbum: %s%n",
                titulo, artista, calcularDuracionMinutos(), genero, album);
    }

    public void mostrarInformacion(String usuario) {
        System.out.printf("Usuario: %s%nTítulo: %s%nArtista: %s%nDuración: %d minutos%nGénero: %s%nÁlbum: %s%n",
                usuario, titulo, artista, calcularDuracionMinutos(), genero, album);
    }
}
