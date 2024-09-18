import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> pArray = new ArrayList<>();
        pArray.add(new Person("Andrzej", "Nowak", 30));
        pArray.add(new Person("Bartek", "Kołakowski", 30));
        pArray.add(new Person("Cezary", "Konazowski", 36));
        pArray.add(new Person("Cezary", "Abazowski", 34));
        pArray.add(new Person("Cezary", "Derezowski", 32));
        Collections.sort(pArray);
        for(Person p : pArray)
        {
            System.out.println(p);
        }
    }
}