package pl.piotrswiatek.kalkulatordiabetyka;

import java.util.Date;

/**
 * Created by Piter on 2016-06-10.
 */
public class GlycemyMeasurment implements CalculateInsulinDose {
    private int glycemy;
    private int foodCarboQuantity;
    private Date measurmentTime;
    private double insulineDose;

    @Override
    public double calculateCorrectiomDose() {
        return 0;
    }

    @Override
    public double calculateFoodDose() {
        return 0;
    }

    @Override
    public double calculateWholeDose() {
        return 0;
    }

    public int getGlycemy() {
        return glycemy;
    }

    public void setGlycemy(int glycemy) {
        this.glycemy = glycemy;
    }

    public int getFoodCarboQuantity() {
        return foodCarboQuantity;
    }

    public void setFoodCarboQuantity(int foodCarboQuantity) {
        this.foodCarboQuantity = foodCarboQuantity;
    }

    public Date getMeasurmentTime() {
        return measurmentTime;
    }

    public void setMeasurmentTime(Date measurmentTime) {
        this.measurmentTime = measurmentTime;
    }

    public double getInsulineDose() {
        return insulineDose;
    }

    public void setInsulineDose(double insulineDose) {
        this.insulineDose = insulineDose;
    }
}
