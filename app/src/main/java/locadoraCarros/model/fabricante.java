package locadoraCarros.model;

public class fabricante {
    private Long id;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public fabricante() {
    }

    public fabricante(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public fabricante(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "fabricante{" + "id=" + id + ", nome=" + nome + '}';
    }

    
    
    
}
