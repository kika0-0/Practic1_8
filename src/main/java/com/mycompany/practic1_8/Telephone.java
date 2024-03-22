/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1_8;

public class Telephone {
    private String model;
    private String number;
    private String colour;
    private boolean isMobile;

    public Telephone(String model, String number, String colour, boolean isMobile) {
        this.model = model;
        this.number = number;
        this.colour = colour;
        this.isMobile = isMobile;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String Number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

   
    
    @Override
    public String toString(){
        return model + "," + number + "," + colour + "," + isMobile;
    }
}