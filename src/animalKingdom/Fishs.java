package animalKingdom;

public class Fishs extends AbstractAnimalClass
{
    public Fishs(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    public Fishs(String name, int yearDiscovered, int food)
    {
        super(name, yearDiscovered, food);
    }


    //methods
    public String move()
    {
        return "swim";
    }

    public String breath()
    {
        return "gills";
    }

    public String reproduce()
    {
        return "eggs";
    }
}