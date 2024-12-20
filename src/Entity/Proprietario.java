package Entity;

public class Proprietario {
    private String id;
    private String nome;
    private String cognome;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String toString(){
        return id + "\t " + nome + "\t " + cognome;
    }
}
