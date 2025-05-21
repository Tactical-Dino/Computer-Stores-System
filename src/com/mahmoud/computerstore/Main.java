package com.mahmoud.computerstore;

import com.mahmoud.computerstore.model.CPU;

/**
 * The Main class demonstrates the creation and usage of the CPU class.
 */
public class Main {
    public static void main(String[] args) {
        // Creating a new CPU object
        CPU myCPU = new CPU(1, "Intel", "Core i5-12600K", "LGA 1700", 125);

        // Displaying the CPU details
        System.out.println("CPU Details:");
        System.out.println(myCPU.toString());
    }
}
