package io.github.loskunos.objectivity.demo.streams.realestate;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static io.github.loskunos.objectivity.demo.streams.realestate.RealEstateRepository.getRealEstates;
import static io.github.loskunos.objectivity.demo.streams.realestate.RealEstateType.BUY;
import static java.util.stream.Collectors.*;

public class StreamPlayground {
  public static void main(String[] args) {
    List<RealEstate> realEstates = getRealEstates();

    // getting stream
    Stream<RealEstate> realEstateStream = realEstates.stream();

    // filtering
    realEstateStream
        .filter(e -> e.getRealEstateAddress().getCity().equals("opole"))
        .filter(StreamPlayground::isBuy)
        .forEach(System.out::println);

    nl();
    realEstateStream = realEstates.stream();
    // mapping
    realEstateStream
        .map(RealEstate::getRealEstateAddress)
        .distinct()
        .forEach(System.out::println);

    nl();
    realEstateStream = realEstates.stream();
    // mapping to prinitives
    System.out.println(
        realEstateStream.mapToInt(e -> e.getArea()).average().getAsDouble());

    nl();
    realEstateStream = realEstates.stream();
    // collecting
    List<String> cities = realEstateStream
        .map(RealEstate::getRealEstateAddress)
        .distinct()
        .map(RealEstateAddress::getCity).collect(toList());
    System.out.println(cities);

    nl();
    realEstateStream = realEstates.stream();
    // collecting as String
    String strCities = realEstateStream
        .map(RealEstate::getRealEstateAddress)
        .distinct()
        .map(RealEstateAddress::getCity).collect(joining(", "));
    System.out.println(strCities);

    nl();
    realEstateStream = realEstates.stream();
    // finding max
    realEstateStream
        .max((e1, e2) -> e1.getArea() - e2.getArea())
        .ifPresent(System.out::println);

    nl();
    realEstateStream = realEstates.stream();
    // reduce
    Integer sum = realEstateStream
        .reduce(
            0,
            (a, e) -> a + e.getArea(),
            (a, b) -> a + b);
    System.out.println(sum);

    nl();
    realEstateStream = realEstates.stream();
    // reduce
    realEstateStream
        .reduce((e1, e2) -> e1.getArea() > e2.getArea() ? e1 : e2)
        .ifPresent(System.out::println);

    nl();
    realEstateStream = realEstates.stream();
    // group by
    Map<RealEstateType, List<RealEstate>> groupByType =
        realEstateStream
            .collect(groupingBy(RealEstate::getRealEstateType));
    System.out.println(groupByType);

    nl();
    realEstateStream = realEstates.stream();
    // Partition  by
    Map<Boolean, List<RealEstate>> potentialFraud =
        realEstateStream
            .filter(StreamPlayground::isBuy)
            .collect(partitioningBy(e -> (e.getPrice() / e.getArea()) < 10));
    System.out.println(potentialFraud);

    nl();
    realEstateStream = realEstates.stream();
    // flat map
    realEstateStream
        .flatMap(e -> e.getContactPersons().stream())
        .distinct()
        .forEach(System.out::println);

    nl();
    // int streams
    IntStream i = IntStream.iterate(1, n -> n + 1).limit(10);
    System.out.println(i.summaryStatistics());
  }

  public static boolean isBuy(RealEstate realEstate) {
    return realEstate.getRealEstateType() == BUY;
  }

  public static void nl() {
    System.out.println();
  }
}
