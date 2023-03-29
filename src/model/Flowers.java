package model;

public class Flowers {
    private String manufacturerCountry;
    private String shelfLifeInDays;
    private String color;
    private long price;

    public Flowers(String manufacturerCountry, String shelfLifeInDays, String color, long price) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLifeInDays = shelfLifeInDays;
        this.color = color;
        this.price = price;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(String shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nFlowers { " +
                "\nmanufacturerCountry: " + manufacturerCountry + '\'' +
                "\nshelfLifeInDays: " + shelfLifeInDays + '\'' +
                "\ncolor: " + color + '\'' +
                "\nprice: " + price +
                '}';
    }
}
