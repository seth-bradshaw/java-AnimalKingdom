package animalKingdom;

public class Birds extends AbstractAnimalClass
{
    public Birds(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    public Birds(String name, int yearDiscovered, int food)
    {
        super(name, yearDiscovered, food);
    }

    //methods
    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

}