package com.example.feign.dto;

import org.springframework.cloud.openfeign.FeignClient;


public class CarApiDto {
    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
