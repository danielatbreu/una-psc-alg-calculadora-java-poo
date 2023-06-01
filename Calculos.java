public class Calculos {

    private double numeroUm;
    private double numeroDois;

    public void setNumeroUm(double numeroUm) {
      this.numeroUm = numeroUm;
    }
    
    public void setNumeroDois(double numeroDois) {
      this.numeroDois = numeroDois;
    }

    public double getNumeroUm() {
      return (numeroUm);
    }

    public double getNumeroDois() {
      return (numeroDois);
    }

    public double somar() {
      return (numeroUm + numeroDois);
    }

    public double subtrair() {
      return (numeroUm - numeroDois);
    }

    public double multiplicar() {
      return (numeroUm * numeroDois);
    }

    public double dividir() {
      return (numeroUm / numeroDois);
    }

    public double potenciar() {
      return (Math.pow(numeroUm, numeroDois));
    }

    public double raizNumeroUm() {
      return (Math.sqrt(numeroUm));
    }

    public double raizNumeroDois() {
      return (Math.sqrt(numeroDois));
    }


}
