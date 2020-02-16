package ua.lviv.iot.gemstone.model;

public abstract class AbstractGemstone {

    protected String color;
    protected double pricePerUSDDollar;
    protected String countryOfOrigin;
    protected String chemicalFormula;
    protected double weightInCarats;

    protected double transparencyFromZeroToOne;

    public AbstractGemstone(String color, double pricePerUSDDollar, String countryOfOrigin, String chemicalFormula, double weightInCarats, double transparencyFromZeroToOne) {
        this.color = color;
        this.pricePerUSDDollar = pricePerUSDDollar;
        this.countryOfOrigin = countryOfOrigin;
        this.chemicalFormula = chemicalFormula;
        this.weightInCarats = weightInCarats;
        this.transparencyFromZeroToOne = transparencyFromZeroToOne;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPricePerUSDDollar() {
        return pricePerUSDDollar;
    }

    public void setPricePerUSDDollar(double pricePerUSDDollar) {
        this.pricePerUSDDollar = pricePerUSDDollar;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }

    public double getWeightInCarats() {
        return weightInCarats;
    }

    public void setWeightInCarats(double weightInCarats) {
        this.weightInCarats = weightInCarats;
    }

    public void setTransparencyFromZeroToOne(double transparencyFromZeroToOne) {
        this.transparencyFromZeroToOne = transparencyFromZeroToOne;
    }

    public double getTransparency() {
        return transparencyFromZeroToOne;
    }
}