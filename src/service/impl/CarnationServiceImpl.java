package service.impl;

import model.Carnation;
import model.Flowers;
import service.FlowersService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarnationServiceImpl implements FlowersService {
    private final List<Carnation> carnations = new ArrayList<>();

    @Override
    public String addFlowers(List t) {
        carnations.addAll(t);
        int addAll = carnations.size();
        return " Added " + addAll + " flowers to the list.";
    }

    @Override
    public List getAllFlowers() {
        carnations.forEach(System.out::println);
        return carnations;
    }

    @Override
    public List getFlowersFinByColor(String color) {
        carnations.stream().filter(x -> x.getColor().equalsIgnoreCase(color)).toList().forEach(System.out::println);
        return carnations;
    }

    @Override
    public Map<String, List> groupingFlowersByColor() {
        Map<String, List<Flowers>> flowersByColor = carnations.stream()
                .collect(Collectors.groupingBy(Flowers::getColor));
        System.out.println(flowersByColor);
        return null;

    }

    @Override
    public int getSumAllFlowers() {
        int sum = carnations.stream().mapToInt(x-> (int) x.getPrice()).sum();
        return sum;
    }

    @Override
    public List getAllFlowersSortByPrice(String ascendingOrDescending) {
        Comparator<Flowers> priceComparator = Comparator.comparing(Flowers::getPrice);
        if (ascendingOrDescending.equalsIgnoreCase("desc")) {
            priceComparator = priceComparator.reversed();
        }
        return carnations.stream()
                .sorted(priceComparator)
                .collect(Collectors.toList());
    }
}
