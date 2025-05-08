package cz.czechitas.ukol3.model;



public class Pamet {
    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    private long kapacita;


    @Override
    public String toString() {
        return "kapacita pameti je: " + kapacita +" B";
    }
}
