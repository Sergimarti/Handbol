public class Partit {

    String resultat1quart;
    String resultat2quart;
    String resultat3quart;
    String resultat4quart;

    public Partit(String resultat1quart, String resultat2quart, String resultat3quart, String resultat4quart) {
        this.resultat1quart = resultat1quart;
        this.resultat2quart = resultat2quart;
        this.resultat3quart = resultat3quart;
        this.resultat4quart = resultat4quart;
    }

    public String getResultat1quart() {
        return resultat1quart;
    }

    public void setResultat1quart(String resultat1quart) {
        this.resultat1quart = resultat1quart;
    }

    public String getResultat2quart() {
        return resultat2quart;
    }

    public void setResultat2quart(String resultat2quart) {
        this.resultat2quart = resultat2quart;
    }

    public String getResultat3quart() {
        return resultat3quart;
    }

    public void setResultat3quart(String resultat3quart) {
        this.resultat3quart = resultat3quart;
    }

    public String getResultat4quart() {
        return resultat4quart;
    }

    public void setResultat4quart(String resultat4quart) {
        this.resultat4quart = resultat4quart;
    }

    @Override
    public String toString() {
        return "Partit{" +
                "resultat1quart='" + resultat1quart + '\'' +
                ", resultat2quart='" + resultat2quart + '\'' +
                ", resultat3quart='" + resultat3quart + '\'' +
                ", resultat4quart='" + resultat4quart + '\'' +
                '}';
    }
}
