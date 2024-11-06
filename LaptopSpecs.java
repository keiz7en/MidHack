package com.keiz.projectlibrary;

public class LaptopSpecs {
    private String cpu;
    private String ram;
    private String gpu;
    private String brand;
    private String dateOfBuy;

    public LaptopSpecs(String cpu, String ram, String gpu, String brand, String dateOfBuy) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.brand = brand;
        this.dateOfBuy = dateOfBuy;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public String getBrand() {
        return brand;
    }

    public String getDateOfBuy() {
        return dateOfBuy;
    }
}
