public class Complejo {
    private double real;
    private double imaginario;
    public Complejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    public double getReal(){
        return real;
    }
    public double getImaginario(){
        return imaginario;
    }
    public void mostrarComplejo(){
        System.out.printf("%s + %si%n", real, imaginario);
    }
    public Complejo conjugado(){
        return new Complejo(this.getReal(), -this.getImaginario());
    }
    public String toString(){
        return String.format("%.2f + %.2fi", this.getReal(), this.getImaginario());
    }
}
