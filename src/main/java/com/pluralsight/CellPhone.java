package com.pluralsight;

public class CellPhone {
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber  = "";
        this.owner = "";
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier(){
        return carrier;

    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhoneNumber() {
        return phoneNumber =phoneNumber;

    }

    public String getOwner() {
        return owner;

    }
}

//serialNumber (ex: 1000000 - 9999999)

//model (ex: iPhone X)

//carrier (ex: AT&T)

//phoneNumber (ex: 800-555-5555)

//owner (ex: Dana Wyatt)
