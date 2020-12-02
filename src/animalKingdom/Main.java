package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    private static List<AbstractAnimalClass> filterAnimals(List<AbstractAnimalClass> theList, CheckAnimal tester)
    {
        List<AbstractAnimalClass> tempList = new ArrayList<>();

        for (AbstractAnimalClass v : theList)
        {
            if(tester.test(v))
            {
                tempList.add(v);
            }
        }
        return tempList;
    }

    public static void main(String[] args)
    {
        Mammals panda = new Mammals("Panda", 1869, 5);
        Mammals zebra = new Mammals("Zebra", 1778, 5);
        Mammals koala = new Mammals("Koala", 1816, 5);
        Mammals seth = new Mammals("Sloth", 1804, 5);
        Mammals armadillo = new Mammals("Armadillo", 1758, 5);
        Mammals racoon = new Mammals("Racoon", 1758, 5);
        Mammals bigfoot = new Mammals("Big Foot", 2021, 5);

        Birds pigeon = new Birds("Pigeon", 1837, 5);
        Birds peacock = new Birds("Peacock", 1821, 5);
        Birds toucan = new Birds("Toucan", 1758, 5);
        Birds parrot = new Birds("Parrot", 1824, 5);
        Birds swan = new Birds("Swan", 1758, 5);

        Fishs salmon = new Fishs("Salmon", 1758, 5);
        Fishs catfish = new Fishs("Catfish", 1817, 5);
        Fishs perch = new Fishs("Perch", 1758, 5);

        List<AbstractAnimalClass> animalList = new ArrayList<>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(seth);
        animalList.add(armadillo);
        animalList.add(racoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

//        List<AbstractAnimalClass> tighttightlist = new ArrayList<>();
//        animals.addAll(Arrays.asList(panda, zebra, etc.))
        System.out.println("*** List all animals in descending order by year ***");
        animalList.sort((v1, v2) -> v1.getYearDiscovered() - v2.getYearDiscovered());
        animalList.forEach((v) -> System.out.println(v.getYearDiscovered()));

        System.out.println("\n*** List all the animals alphabetically ***");
        animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalList.forEach((v) -> System.out.println(v.getName()));

        System.out.println("\n*** List all the animals order by how they move ***");
        animalList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        animalList.forEach((v) -> System.out.println(v.move()));

        System.out.println("\n*** List only those animals the breath with lungs ***");
        List<AbstractAnimalClass> filteredList = filterAnimals(animalList, (v) -> v.breath() == "lungs");
        filteredList.forEach((v) -> System.out.println(v));

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        List<AbstractAnimalClass> newFilteredList = filterAnimals(animalList, (v) -> v.getYearDiscovered() == 1758 && v.breath() == "lungs");
        newFilteredList.forEach((v) -> System.out.println(v));

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        List<AbstractAnimalClass> brandNewFilteredList = filterAnimals(animalList, (v) -> v.reproduce() == "eggs" && v.breath() == "lungs");
        brandNewFilteredList.forEach((v) -> System.out.println(v));

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        List<AbstractAnimalClass> brandSpankingNewFilteredList = filterAnimals(animalList, (v) -> v.getYearDiscovered() == 1758);
        brandSpankingNewFilteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        brandSpankingNewFilteredList.forEach((v) -> System.out.println(v));

        System.out.println("\n*** STRETCH GOALS ***");
        List<AbstractAnimalClass> stretchgoal = filterAnimals(animalList, (v) -> v instanceof Mammals);
        stretchgoal.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        stretchgoal.forEach((v) -> System.out.println(v));

    }
}