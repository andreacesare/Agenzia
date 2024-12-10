package Entity;

public class Annesso {

    private String id;
    private String tipo;
    private String superficie;
    private Immobile immobile;
    private String idi; //idimmobile

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getSuperficie() {
        return superficie;
    }
    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }
    public Immobile getImmobile() {
        return immobile;
    }
    public void setImmobile(Immobile immobile) {
        this.immobile = immobile;
    }
    public String getIdi() {
        return idi;
    }
    public void setIdi(String idi) {
        this.idi = idi;
    }

    public String toString() {
        return id + "\t " + tipo + "\t " + superficie+ "\t " + idi;
    }
}
