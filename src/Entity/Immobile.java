package Entity;

public class Immobile {
    private String id;
    private String tipo;
    private int vani;
    private int costo;
    private int superficie;
    private int anno;
    private Proprietario proprietario;

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
    public int getVani() {
        return vani;
    }
    public void setVani(int vani) {
        this.vani = vani;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public int getSuperficie() {
        return superficie;
    }
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public Proprietario getProprietario() {
        return proprietario;
    }
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String toString(){
        return id+"\t tipo:"+tipo+"\t vani:"+vani+"\t costo:"+costo+"\t suprficie mq:"+superficie+"\t anno:"+anno;
    }

}
