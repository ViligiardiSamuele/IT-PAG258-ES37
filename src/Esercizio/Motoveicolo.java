package Esercizio;

import Esercizio.Enum.Alimentazione;

import java.time.LocalDate;

public class Motoveicolo extends Veicolo {


    public Motoveicolo(String targa, String marca, String modello, Alimentazione alimentazione, int nPasseggeri, float HP, LocalDate immatricolazione) {
        super(targa, marca, modello, alimentazione, nPasseggeri, HP, immatricolazione);
    }

    public Motoveicolo(Motoveicolo m) {
        super(m.getTarga(), m.getMarca(), m.getModello(), m.getAlimentazione(), m.getnPasseggeri(), m.getHP(), m.getImmatricolazione());
    }

    @Override
    public double getTassa() {
        return this.getHP() * this.getAlimentazione().getRapportoEurHP();
    }
}
