package Esercizio;

import Esercizio.Enum.Alimentazione;

import java.time.LocalDate;

public abstract class Veicolo {
    private String targa, marca, modello;
    private Alimentazione alimentazione;
    private int nPasseggeri;
    private float HP;
    private LocalDate immatricolazione;

    public Veicolo(String targa, String marca, String modello, Alimentazione alimentazione, int nPasseggeri, float HP, LocalDate immatricolazione) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.alimentazione = alimentazione;
        this.nPasseggeri = nPasseggeri;
        this.HP = HP;
        this.immatricolazione = immatricolazione;
    }

    //GETTER
    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getnPasseggeri() {
        return nPasseggeri;
    }

    public LocalDate getImmatricolazione() {
        return immatricolazione;
    }

    public Alimentazione getAlimentazione() {
        return alimentazione;
    }

    public float getHP() {
        return HP;
    }

    //SETTER
    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setnPasseggeri(int nPasseggeri) {
        this.nPasseggeri = nPasseggeri;
    }

    public void setImmatricolazione(LocalDate immatricolazione) {
        this.immatricolazione = immatricolazione;
    }

    public void setAlimentazione(Alimentazione alimentazione) {
        this.alimentazione = alimentazione;
    }

    public void setHP(float HP) {
        this.HP = HP;
    }

    public abstract double getTassa();
}