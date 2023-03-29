package service.impl;

import model.Flowers;
import model.Tulip;
import service.FlowersService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TulipServiceImpl implements FlowersService {
    private final List<Tulip> tulips = new ArrayList<>();

    @Override
    public String addFlowers(List t) {
        tulips.addAll(t);
        int addAll = tulips.size();
        return " Added " + addAll + " flowers to the list.";
    }

    @Override
    public List getAllFlowers() {
        tulips.forEach(System.out::println);
        return tulips;
    }

    @Override
    public List getFlowersFinByColor(String color) {
        tulips.stream().filter(x -> x.getColor().equalsIgnoreCase(color)).toList().forEach(System.out::println);
        return tulips;
    }

    @Override
    public Map<String, List> groupingFlowersByColor() {
        Map<String, List<Flowers>> flowersByColor = tulips.stream()
                .collect(Collectors.groupingBy(Flowers::getColor));
        System.out.println(flowersByColor);
        return null;

    }

    @Override
    public int getSumAllFlowers() {
        int sum = tulips.stream().mapToInt(x-> (int) x.getPrice()).sum();
        return sum;
    }

    @Override
    public List getAllFlowersSortByPrice(String ascendingOrDescending) {
        Comparator<Flowers> priceComparator = Comparator.comparing(Flowers::getPrice);
        if (ascendingOrDescending.equalsIgnoreCase("desc")) {
            priceComparator = priceComparator.reversed();
        }
        return tulips.stream()
                .sorted(priceComparator)
                .collect(Collectors.toList());
    }
}
