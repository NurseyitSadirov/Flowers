package service.impl;

import model.Flowers;
import model.Rose;
import service.FlowersService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RoseService implements FlowersService {
    private final List<Rose> roses = new ArrayList<>();

    @Override
    public String addFlowers(List t) {
        roses.addAll(t);
        int addAll = roses.size();
        return " Added " + addAll + " flowers to the list.";
    }

    @Override
    public List getAllFlowers() {
        roses.forEach(System.out::println);
        return roses;
    }

    @Override
    public List getFlowersFinByColor(String color) {
        System.out.println("Write color ");
        roses.stream().filter(x -> x.getColor().equalsIgnoreCase(color)).toList().forEach(System.out::println);
        return roses;
    }

    @Override
    public Map<String, List> groupingFlowersByColor() {
        Map<String, List<Flowers>> flowersByColor = roses.stream()
                .collect(Collectors.groupingBy(Flowers::getColor));
        System.out.println(flowersByColor);
        return null;

    }

    @Override
    public int getSumAllFlowers() {
        int sum = roses.stream().mapToInt(x-> (int) x.getPrice()).sum();
        return sum;
    }

    @Override
    public List getAllFlowersSortByPrice(String ascendingOrDescending) {
        Comparator<Flowers> priceComparator = Comparator.comparing(Flowers::getPrice);
        if (ascendingOrDescending.equalsIgnoreCase("desc")) {
            priceComparator = priceComparator.reversed();
        }
        return roses.stream()
                .sorted(priceComparator)
                .collect(Collectors.toList());
    }
}
