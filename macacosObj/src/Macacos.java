public class Macacos {
    private int id;
    private int nroCocos;
    private int destinoImpar;
    private int destinoPar;
    private int nroDestinoImpar;
    private int nroDestinoPar;
    public Macacos(int id, int nroCocos, int destinoPar,int destinoImpar, int nroDestinoPar, int nroDestinoImpar) {
        this.id = id;
        this.nroCocos = nroCocos;
        this.destinoPar = destinoPar;
        this.destinoImpar = destinoImpar;
        this.nroDestinoPar = nroDestinoPar;
        this.nroDestinoImpar = nroDestinoImpar;
    }

    public void addCocosPar(int nro){
        nroDestinoPar+=nro;
    }

    public void addCocosImpar(int nro){
        nroDestinoImpar+=nro;
    }


    public void removeCocos(){
        nroDestinoPar = 0;
        nroDestinoImpar = 0;
    }
    public int getId() {
        return id;
    }
    public int getNroCocos() {
        return nroDestinoImpar + nroDestinoPar;
    }
    public void setNroCocos(int nroCocos) {
        this.nroCocos = nroCocos;
    }
    public int getDestinoImpar() {
        return destinoImpar;
    }
    public void setDestinoImpar(int destinoImpar) {
        this.destinoImpar = destinoImpar;
    }
    public int getDestinoPar() {
        return destinoPar;
    }
    public int getNroDestinoImpar() {
        return nroDestinoImpar;
    }
    public int getNroDestinoPar() {
        return nroDestinoPar;
    }
    @Override
    public String toString() {
        return "id=" + id + " " + nroCocos +" " +  destinoPar +" " +  destinoImpar +" " +  nroDestinoImpar +" " +  nroDestinoPar+ "]";
    }
}
