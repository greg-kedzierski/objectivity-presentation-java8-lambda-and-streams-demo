package io.github.loskunos.objectivity.demo.streams.realestate;

public class RealEstateAddress {
  private final String city;

  public RealEstateAddress(String city) {
    this.city = city;
  }

  public static RealEstateAddress address(String city) {
    return new RealEstateAddress(city);
  }

  public String getCity() {
    return city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    RealEstateAddress that = (RealEstateAddress) o;

    if (!city.equals(that.city)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return city.hashCode();
  }

  @Override
  public String toString() {
    return "RealEstateAddress{" +
        "city='" + city + '\'' +
        '}';
  }
}
