package csit105project04samplefall19;

/**
 *
 * @author Stephen Brower
 */
public class Food {
    private String description;
    private int calories;
    private double price;

    /**
     * Constructor
     * @param initialDescription value for the description field
     * @param initialCalories value for the calories field
     * @param initialPrice value for the price field
     */
    public Food(String initialDescription, int initialCalories,
            double initialPrice) {
        description = initialDescription;
        calories = initialCalories;
        price = initialPrice;
    }

    /**
     * getDescription returns the value in the description field
     * @return value in the description field
     */
    public String getDescription() {
        return description;
    }

    /**
     * setDescription assigns a new value for the description field
     * @param newDescription new value for the description field
     */
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    /**
     * getCalories returns the value in the calories field
     * @return value in the calories field
     */
    public int getCalories() {
        return calories;
    }

    /**
     * setCalories method assigns a new value for the calories field
     * @param newCalories value for the calories field
     */
    public void setCalories(int newCalories) {
        calories = newCalories;
    }

    /**
     * getPrice method returns the value from the price field
     * @return value from the price field
     */
    public double getPrice() {
        return price;
    }

    /**
     * newPrice method assigns a new value for the price field
     * @param newPrice new value for the price field
     */
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    
    
    
    /**
     * toString returns a textual equivalent of this Food Object
     * @return textual equivalent of this Food Object
     */
    public String toString() {
        return "Food: desc: " + description + 
                " cal: " + calories +
                " price: " + String.format("%,.2f",price);
    }
    
    /**
     * equals method compares this Food to the other Food passed
     * @param obj generic object passed
     * @return true or false depending if they are the same
     * @throws ClassCastException 
     */
    @Override
    public boolean equals(Object obj) throws ClassCastException {
        if ( !(obj instanceof Food ))
            throw new ClassCastException("not food!");
        Food otherFood = (Food) obj;
        boolean isSame = false;
        if (otherFood.getDescription().equalsIgnoreCase(description)
                && otherFood.getCalories() == calories
                && price == otherFood.getPrice())
            isSame = true;
        else
            isSame = false;
        return isSame;
               
            
    }
    
}
