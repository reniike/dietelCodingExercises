package chapterFour;

public class TaxCalculator {
    private String name;
    private double earning;
    private int year;
    private double tax;

    public TaxCalculator(String name, double earning, int year) {
        this.name = name;
        this.earning = earning;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public double getEarning() {
        return earning;
    }

    public int getYear() {
        return year;
    }

    public void setTax(){
        if (earning <= 30_000 ) {
            tax = 0.15 * earning;
        } else {
            tax = 0.2 * earning;
        }
    }
    public double getTax() {
        return tax;
    }
}

