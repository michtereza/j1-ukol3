package cz.czechitas.ukol3.model;

import java.util.Objects;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }


    @Override
    public String toString() {
        return "kapacita disku je: " + kapacita + " B" + ", vyuzite misto: " + vyuziteMisto + " B";

    }
}

