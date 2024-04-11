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
    public String toString(){
        return String.format("%s + %si", this.getReal(), this.getImaginario());
    }
}
