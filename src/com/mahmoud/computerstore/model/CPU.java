package com.mahmoud.computerstore.model;

/**
 * Represents a CPU component.
 * Holds all CPU-specific fields (id, brand, model, socket, tdp).
 */
public class CPU {
    private int id;
    private String brand;
    private String model;
    private String socket;
    private int tdp; // Thermal Design Power in Watts

    /**
     * Constructor to initialize a CPU object with specified attributes.
     *
     * @param id     Unique identifier for the CPU.
     * @param brand  Manufacturer of the CPU (e.g., Intel, AMD).
     * @param model  Model name or number of the CPU.
     * @param socket Socket type (e.g., LGA 1700, AM5).
     * @param tdp    Thermal Design Power in Watts.
     */
    public CPU(int id, String brand, String model, String socket, int tdp) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.socket = socket;
        this.tdp = tdp;
    }



    // Getter methods to access the private attributes
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSocket() {
        return socket;
    }

    public int getTdp() {
        return tdp;
    }

    /**
     * Returns a string representation of the CPU object.
     *
     * @return Formatted string with CPU details.
     */
    public String toString() {
        return "CPU ID: " + id +
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nSocket: " + socket +
                "\nTDP: " + tdp + "W";
    }
}
