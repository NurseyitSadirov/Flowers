import model.Rose;
import service.impl.RoseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**1. Жаны проект тузунуз.
         2. Flower деген класс тузунуз, ичинде переменныйлар:
         (manufacturerCountry, shelfLifeInDays, color, price)  -  (страна производитель, срок хранения в днях, цвет, цена.)
         3. Flower_ди мурастаган 3  класс тузунуз
         (мисалы: Rose, Carnation, Tulip )  -   (Роза, Гвоздика, Тюльпан)
         4. FlowerService<Т> деген generic интервейс тузунуз анын ичинде төмөндөгүдөй методдор болсун.
         - String addFlowers(List<T> t);
         - List<T> getAllFlowers();
         -  List<T> getFlowersFinByColor(String color);
         - Map<String, List<T>> groupingFlowersByColor();
         - int getSumAllFlowers();
         - List<T> getAllFlowersSortByPrice(String ascendingOrDescending);
         RoseService (private List<Rose> roses) , CarnationServiceImpl
         (private List<Carnation> carnations), TulipServiceImpl(private List<Tulip> tulip)
         деген класстар FlowerService_ди implement кылып методдорн реализация кылсын.*/

        List<Rose> roses = List.of(
                new Rose("KYRGYZSTAN","29-03-2023","Blue",1200),
                new Rose("UZBEKISTAN","29-02-2023","Blue",1200),
                new Rose("USA","29-01-2023","Blue",1200),
                new Rose("RUSSIAN","29-12-2022","Blue",1200),
                new Rose("ITALY","29-11-2022","Blue",1200)
        );
        RoseService roseService = new RoseService();
        System.out.println(roseService.addFlowers(roses));
    }
}