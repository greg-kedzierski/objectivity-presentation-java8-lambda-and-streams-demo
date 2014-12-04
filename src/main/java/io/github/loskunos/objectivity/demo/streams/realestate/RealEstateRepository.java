package io.github.loskunos.objectivity.demo.streams.realestate;

import java.util.List;

import static io.github.loskunos.objectivity.demo.streams.realestate.RealEstateAddress.address;
import static io.github.loskunos.objectivity.demo.streams.realestate.RealEstateType.BUY;
import static io.github.loskunos.objectivity.demo.streams.realestate.RealEstateType.RENT;
import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

public class RealEstateRepository {

  private final static List<RealEstate> realEstates = unmodifiableList(asList(
      new RealEstate(
          BUY, address("wroclaw"), 55, 10000, asList("Piotr", "Pawel", "Piotr")),
      new RealEstate(
          BUY, address("opole"), 155, 10000, asList("Lukasz")),
      new RealEstate(
          BUY, address("wroclaw"), 45, 10000, asList("Piotr", "Tomek")),
      new RealEstate(
          BUY, address("warszawa"), 22, 10000, asList("Piotr", "Pawel", "Lukasz")),
      new RealEstate(
          RENT, address("wroclaw"), 221, 10000, asList("Tomek", "Pawel", "Piotr")),
      new RealEstate(
          RENT, address("warszawa"), 55, 10000, asList("Piotr", "Adam", "Tomek")),
      new RealEstate(
          RENT, address("warszawa"), 79, 10000, asList("Grzegorz", "Pawel", "Piotr")),
      new RealEstate(
          RENT, address("opole"), 11, 10000, asList("Piotr")),
      new RealEstate(
          RENT, address("opole"), 24, 10000, asList("Krzysztof")),
      new RealEstate(
          BUY, address("wroclaw"), 56, 10000, asList("Grzegorz"))
  ));

  public static List<RealEstate> getRealEstates() {
    return realEstates;
  }
}
