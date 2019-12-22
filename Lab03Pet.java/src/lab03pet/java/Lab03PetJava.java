/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03pet.java;

import java.util.Scanner;

/**
 *
 * Sai Vikram Molakala Date Written: 09/18/19
 */
public class Lab03PetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //insert a keyboard
        Scanner keyboard = new Scanner(System.in);
        Pet myPet;

        String name;
        String type;
        int age;
        
        //Get Pets name
        System.out.print("What is the pets name? ");
        name = keyboard.nextLine();
        
        //Get Type of pet
        System.out.print("What is the pets type? ");
        type = keyboard.nextLine();
        
        //Get pets age
        System.out.print("What is the pets age?  ");
        age = keyboard.nextInt();

        //Initialize new pet to get new data
        myPet = new Pet(name, type, age);
        
        //Displays all collected data
        System.out.println(myPet.getName() + " is a(n) " + myPet.getType() + " and is " + myPet.getAge() + " years old");

    }

}
