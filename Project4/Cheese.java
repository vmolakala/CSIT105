package csit105project04samplefall19;

/**
 *
 * @author Stephen Brower
 */
public class Cheese extends Food {

    private int monthsAged;

    /**
     * Constructor
     *
     * @param initialDescription value for the description field
     * @param initialCalories value for the calories field
     * @param initialMonthsAged value for the monthsAged field
     * @param initialPrice value for the price field
     */
    public Cheese(String initialDescription, int initialCalories,
            double initialPrice, int initialMonthsAged) {
        super(initialDescription, initialCalories,initialPrice);
        monthsAged = initialMonthsAged;
    }

    /**
     * getMonthsAged returns the value from the monthsAged field
     *
     * @return value from the monthsAged field
     */
    public int getMonthsAged() {
        return monthsAged;
    }

    /**
     * setMonthsAged assigns a new setMonthsAged
     *
     * @param newMonthsAged new value for the monthsAged field
     */
    public void setMonthsAged(int newMonthsAged) {
        monthsAged = newMonthsAged;
    }

    /**
     * equals method compares this Cheese to the other Cheese passed
     *
     * @param obj generic object passed
     * @return true or false depending if they are the same
     * @throws ClassCastException
     */
    public boolean equals(Object obj) throws ClassCastException {
        if (!(obj instanceof Cheese)) {
            throw new ClassCastException("not food!");
        }
        Cheese otherFood = (Cheese) obj;
        boolean isSame = false;
        if (otherFood.getDescription().equalsIgnoreCase(getDescription())
                && otherFood.getCalories() == getCalories()
                && otherFood.getMonthsAged() == monthsAged 
                && otherFood.getPrice() == getPrice()) {
            isSame = true;
        } else {
            isSame = false;
        }
        return isSame;

    }

    /**
     * toString returns a textual equivalent of this Cheese Object
     *
     * @return textual equivalent of this Cheese Object
     */
    public String toString() {
        return "Cheese: desc: " + getDescription()
                + " cal: " + getCalories()
                + " price: " + String.format("%,.2f",getPrice())
                + " mo. aged: " + monthsAged;
    }
}
