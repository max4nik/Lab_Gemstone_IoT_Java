package ua.lviv.iot.gemstone.model;

public class SemipreciousStone extends Gemstone {

    protected String specialSemipreciousStoneID;

    public SemipreciousStone(String color, double pricePerUSDDollar, String countryOfOrigin, String chemicalFormula, double weightInCarats, double transparencyFromZeroToOne, String specialSemipreciousStoneID) {
        super(color, pricePerUSDDollar, countryOfOrigin, chemicalFormula, weightInCarats, transparencyFromZeroToOne);
        this.specialSemipreciousStoneID = specialSemipreciousStoneID;
    }

    public String getSpecialSemipreciousStoneID() {
        return specialSemipreciousStoneID;
    }

    public void setSpecialSemipreciousStoneID(String specialSemipreciousStoneID) {
        this.specialSemipreciousStoneID = specialSemipreciousStoneID;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "specialSemipreciousStoneID";
    }

    public String toCSV() {
        return super.toCSV() + "," + specialSemipreciousStoneID;
    }
}
