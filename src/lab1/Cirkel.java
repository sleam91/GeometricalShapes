package lab1;

public class Cirkel {

    private final double PI = 3.14;
    private double radie;

    public Cirkel(double radie) {
        this.radie = radie;
    }

    public double getRadie() {
        return radie;
    }

    public void setRadie(double radie) {
        this.radie=radie;
    }
    
    public double area(){
        double area=radie*radie*PI;
        return area;
    }

}
