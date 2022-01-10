package com.company;

public class Produkte {
    private String name;
    private int preis;
    private String SKU;
    private String initialeAnzahlProdukte;

    public Produkte(String name, int preis, String SKU, String initialeAnzahlProdukte) {
        this.name = name;
        this.preis = preis;
        this.SKU = SKU;
        this.initialeAnzahlProdukte = initialeAnzahlProdukte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getInitialeAnzahlProdukte() {
        return initialeAnzahlProdukte;
    }

    public void setInitialeAnzahlProdukte(String initialeAnzahlProdukte) {
        this.initialeAnzahlProdukte = initialeAnzahlProdukte;
    }
}
