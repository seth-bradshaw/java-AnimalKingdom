package animalKingdom;

public class Mammals extends AbstractAnimalClass
{
    //constructives
    public Mammals(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    public Mammals(String name, int yearDiscovered, int food)
    {
        super(name, yearDiscovered, food);
    }

    //methods
    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}