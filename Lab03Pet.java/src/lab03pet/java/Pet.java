/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03pet.java;

/**
 *
 * Sai Vikram Molakala Date Written: 09/18/19
 */
public class Pet {

    private String name;
    private String type;
    private int age;

    /**
     * Constructors:
     *
     * @param initialName value for name field
     * @param initialAge value for the age field
     * @param initialType value for the type field
     */
    public Pet(String initialName, String initialType, int initialAge) {

        name = initialName;
        type = initialType;
        age = initialAge;
    }

    /**
     * setName changes the value in the name field
     * @param newName new value for the name field
     * 
     * setType method changes the value in the type field
     * @param newType new value for the type field
     * 
     * setAge method changes the value in the age field
     * @param newAge new value for the age field
     */
     
    public void setName(String newName) {
        name = newName;
    }

    public void setType(String newType) {
        type = newType;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    /**
     * getName method returns value in name field
     *
     * @return value in name field getType method returns value in type field
     * @return value in type field getAge method returns value in age field
     * @return value in age field
     */
    public String getName() {

        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

}
