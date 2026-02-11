package com.motormall.motormallserver.model;

public class CarModel {
    String imgLink;
    String carName;
    String carBrand;
    String carPower;
    String speed0to100;
    String topSpeed;
    String videoLink;

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getCardetails() {
        return cardetails;
    }

    public void setCardetails(String cardetails) {
        this.cardetails = cardetails;
    }

    String cardetails;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    String price;

    public CarModel() {
    }

    public CarModel(String imgLink, String carName, String carBrand, String carPower, String speed0to100, String topSpeed, String videoLink, String cardetails, String price) {
        this.imgLink = imgLink;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carPower = carPower;
        this.speed0to100 = speed0to100;
        this.topSpeed = topSpeed;
        this.videoLink = videoLink;
        this.cardetails = cardetails;
        this.price = price;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarPower() {
        return carPower;
    }

    public void setCarPower(String carPower) {
        this.carPower = carPower;
    }

    public String getSpeed0to100() {
        return speed0to100;
    }

    public void setSpeed0to100(String speed0to100) {
        this.speed0to100 = speed0to100;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }
}
