package com.pluralsight;

public class CellPhone {
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone (long serialNumber,String model,String carrier,String phoneNumber,String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
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

    public String getPhoneNumber() {
        return phoneNumber;

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
