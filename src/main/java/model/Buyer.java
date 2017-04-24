package model;

/**
 * Created by Daria Serebryakova on 18.04.2017.
 */
public class Buyer {
    private int id;
    private String lastName;
    private String buyerDistrict;
    private int discount;

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBuyerDistrict(String buyerDistrict) {
        this.buyerDistrict = buyerDistrict;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBuyerDistrict() {
        return buyerDistrict;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", buyerDistrict='" + buyerDistrict + '\'' +
                ", discount=" + discount +
                '}';
    }
}
