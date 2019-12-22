package csit105lab04whichactivityfall19;

import javax.lang.model.util.ElementScanner6;

/**
 * Class for Lab 4
 * @author Stephen T. Brower ( put your name in the javadoc comment block
 * for the recommendedActivity method )
 */
public class TemperatureBasedActivity {

    private int outdoorTemperature;

    /**
     * Constructor
     *
     * @param initialOutdoorTemperature initial value for the outdoorTemperature
     * field.
     */
    public TemperatureBasedActivity(int initialOutdoorTemperature) {
        outdoorTemperature = initialOutdoorTemperature;
    }

    /**
     * getOutdoorTemperature method returns the value from the
     * outdoorTemperature field
     *
     * @return value from the outdoorTemperature field
     */
    public int getOutdoorTemperature() {
        return outdoorTemperature;
    }

    /**
     * setOutdoorTemperature method assigns a new value for the
     * outdoorTemperature field
     *
     * @param newOutdoorTemperature new value for the outdoorTemperature field
     */
    public void setOutdoorTemperature(int newOutdoorTemperature) {
        outdoorTemperature = newOutdoorTemperature;
    }

    /**
     * the recommendedActivity method returns a suggested activity based on the
     * value currently in outdoorTemperature
     * 
     * Vikram Molakala    
     * Date Written: 9/25/19   
     *
     * @return a String with the recommended activity
     */
    public String recommendedActivity() {
        String recommendedActivityToReturn;

        // write an if-else-if chain based on outdoorTemperature here
            if (outdoorTemperature <= 10) {
            recommendedActivityToReturn = "Checkers";
        } else if (outdoorTemperature >=11 && outdoorTemperature <=32){
            recommendedActivityToReturn = "Skiing";
        } else if (outdoorTemperature >=33 && outdoorTemperature <=50){
            recommendedActivityToReturn = "Golf";
        } else if (outdoorTemperature >=51 && outdoorTemperature <=80){
            recommendedActivityToReturn = "Tennis";
        } else if (outdoorTemperature >=81 && outdoorTemperature <=100){
            recommendedActivityToReturn = "Swimming";
        } else {
            recommendedActivityToReturn = "Move North";
        }
    
            return recommendedActivityToReturn;
    }
}
