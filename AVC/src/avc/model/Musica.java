package avc.model;

public class Musica {
    private String nome, artista, genero, comentario;
    private int estrelas;
    
    public Musica(String nome, String artista, String genero, String comentario, int estrelas) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.comentario = comentario;
        this.estrelas = estrelas;
    }

    public String getNome() { return nome; }
    public String getArtista() { return artista; }
    public String getGenero() { return genero; }
    public String getComentario() { return comentario; }
    public int getEstrelas() { return estrelas; }

    // Formato para salvar no TXT
    public String toFileFormat() {
        return nome + ";" + artista + ";" + genero + ";" + comentario + ";" + estrelas;
    }

    @Override
    public String toString() {
        return "🎵 " + nome + " - " + artista + " [" + estrelas + "/5]\n" +
               "Gênero: " + genero + "\n" +
               "Comentário: " + comentario;
    }
}