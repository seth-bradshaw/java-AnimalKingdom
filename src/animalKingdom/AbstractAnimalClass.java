package animalKingdom;

abstract class AbstractAnimalClass
{
    //variables
    private static int maxId = 1;
    protected int id;
    protected String name;
    protected int yearDiscovered;
    protected int food;

    //constructors
    public AbstractAnimalClass(String name, int yearDiscovered)
    {
        id = maxId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        food = 1;
    }

    public AbstractAnimalClass(String name, int yearDiscovered, int food)
    {
        id = maxId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.food = food;
    }

    //methods
    abstract String move();

    abstract String breath();

    abstract String reproduce();

    public void eatFood(int food)
    {
        food += this.food;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered)
    {
        this.yearDiscovered = yearDiscovered;
    }

    public int getFood()
    {
        return food;
    }

    public void setFood(int food)
    {
        this.food = food;
    }

    public String toString()
    {
        return "Name: " + name + " Year: " + yearDiscovered + " Food Quantity: " + food + " Move: "
                + move() + " Breath: " + breath() + " Reproduce " + reproduce();
    }
}