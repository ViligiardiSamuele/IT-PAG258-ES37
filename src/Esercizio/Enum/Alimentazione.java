package Esercizio.Enum;

public enum Alimentazione {
    BENZINA(2.5),
    GASOLIO(2.5),
    GPL(0.75),
    METANO(0.5),
    IDROGENO(0.1),
    ELETTRICO(0);
    private double rapportoEurHP;

    Alimentazione(double rapportoEurHP) {
        this.rapportoEurHP = rapportoEurHP;
    }

    Alimentazione(Alimentazione a) {
        this.rapportoEurHP = a.rapportoEurHP;
    }

    public double getRapportoEurHP() {
        return rapportoEurHP;
    }

    @Override public String toString(){
        switch (this){
            case BENZINA -> {return "Benzina";}
            case GASOLIO -> {return "Gasolio";}
            case GPL -> {return "GPL";}
            case METANO -> {return "Metano";}
            case IDROGENO -> {return "Idrogeno";}
            case ELETTRICO -> {return "Elettrico";}
            default -> {return "";}
        }
    }
}