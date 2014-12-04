package io.github.loskunos.objectivity.demo.streams.realestate;

import java.util.List;

public class RealEstate {
  private final RealEstateType realEstateType;
  private final RealEstateAddress realEstateAddress;
  private final int area;
  private final int price;

  private final List<String> contactPersons;

  public RealEstate(RealEstateType realEstateType, RealEstateAddress realEstateAddress, int area, int price, List<String> contactPersons) {
    this.realEstateType = realEstateType;
    this.realEstateAddress = realEstateAddress;
    this.area = area;
    this.price = price;
    this.contactPersons = contactPersons;
  }

  public RealEstateType getRealEstateType() {
    return realEstateType;
  }

  public RealEstateAddress getRealEstateAddress() {
    return realEstateAddress;
  }

  public int getArea() {
    return area;
  }

  public List<String> getContactPersons() {
    return contactPersons;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "RealEstate{" +
        "realEstateType=" + realEstateType +
        ", realEstateAddress=" + realEstateAddress +
        ", area=" + area +
        ", price=" + price +
        ", contactPersons=" + contactPersons +
        '}';
  }
}
