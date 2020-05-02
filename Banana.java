import java.text.DecimalFormat;

public abstract class Banana {
    double weightPerUnit; // per 1 banana
    int ripeness; // between 1 - 10
    String type;
    double pricePerKg;

    public Banana(){}

    public Banana(double weightPerUnit, int ripeness, String type, double pricePerKg){
        this.weightPerUnit = weightPerUnit;
        this.ripeness = ripeness;
        this.type = type;
        this.pricePerKg = pricePerKg;
    }

    public abstract int expiration();

    public double calculatePricePerUnit(){
        double pricePerUnit;
        double discout = 5;
        pricePerUnit = pricePerKg * weightPerUnit * expiration();
        if(weightPerUnit > 0.2){
            pricePerUnit *= (1 + 5/100);
        }
        return pricePerUnit;
    }
}
class CultivatedBanana extends Banana {
    public CultivatedBanana(double weightPerUnit, int ripeness, String type, double pricePerKg) {
        super(weightPerUnit, ripeness, type, pricePerKg);
    }

    @Override
    public int expiration(){
        int daysLeft = 10;
        daysLeft -= ripeness;
        return daysLeft;
    }

    public String toString(){
        //Formatting the calculatePricePerUnit() method's return value
        double f = calculatePricePerUnit();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double twoDigitsF = Double.valueOf(decimalFormat.format(f));

        return "Weight: " + weightPerUnit + "\nripness: " + ripeness +
                "\nbanana type: " + type + "\nprice per Kg: " + pricePerKg +
                "\nexpires in (days): " + expiration() +
                "\nprice per banana: " + twoDigitsF + "\n";
    }
}

class WildBanana extends Banana{
    double angle; // from 0 to 45 degrees

    public WildBanana(double weightPerUnit, int ripeness, String type, double pricePerKg, double angle){
        super(weightPerUnit, ripeness, type, pricePerKg);
        this.angle = angle;
    }

    @Override
    public int expiration(){
        int daysLeft = 10;
        daysLeft = (daysLeft - ripeness)/2;
        return daysLeft;
    }

    public String toString(){
        //Formatting the calculatePricePerUnit() method's return value
        double f = calculatePricePerUnit();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double twoDigitsF = Double.valueOf(decimalFormat.format(f));

        return "Weight: " + weightPerUnit + "\nripness: " + ripeness +
                "\nbanana type: " + type + "\nprice per Kg: " + pricePerKg +
                "\nangle: " + angle + "\nexpires in (days): " + expiration() +
                "\nprice per banana: " + twoDigitsF + "\n";
    }
}
