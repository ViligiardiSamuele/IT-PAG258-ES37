package Esercizio;

import Esercizio.Enum.Alimentazione;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Autoveicolo extends Veicolo {

    public Autoveicolo(String targa, String marca, String modello, Alimentazione alimentazione, int nPasseggeri, float HP, LocalDate immatricolazione) {
        super(targa, marca, modello, alimentazione, nPasseggeri, HP, immatricolazione);
    }
    public Autoveicolo(Autoveicolo a) {
        super(a.getTarga(), a.getMarca(), a.getModello(), a.getAlimentazione(), a.getnPasseggeri(), a.getHP(), a.getImmatricolazione());
    }
    @Override
    public double getTassa() {
        if(
                LocalDateTime.now().getYear() - this.getImmatricolazione().getYear() >= 5 &&
                this.getAlimentazione().equals(Alimentazione.METANO) ||
                this.getAlimentazione().equals(Alimentazione.GPL)
        ) return this.getHP() * this.getAlimentazione().getRapportoEurHP();
        else if(this.getAlimentazione().equals(Alimentazione.IDROGENO)){
            double tot = 0;
            for(int i = 0; i < LocalDateTime.now().getYear() - this.getImmatricolazione().getYear(); i++)
                tot += this.getHP() * ( this.getAlimentazione().getRapportoEurHP() * i);
            return tot;
        }
        return 0;
    }
}