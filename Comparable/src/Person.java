public class Person implements Comparable<Person>
{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o)
    {
        if(!name.equals(o.name))
        {
            return name.compareTo(o.name);
        }
        else if(!surname.equals(o.surname))
        {
            return surname.compareTo(o.surname);
        }
        else
        {
            return age - o.age;
        }
    }
}