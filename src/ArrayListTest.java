import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        //COMPLETE ME: print each name using an index based for loop
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }
        //COMPLETE ME: print each name (again!) using enhanced for loop
        for (String name : names)
        {
            System.out.println(name);
        }
        //COMPLETE ME: print each name (a third time!) using a while loop
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }

        // Add to your runner class
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // COMPLETE ME: print each Cat’s name using a
        // standard for loop
        for (int k = 0; k < catList.size(); k++)
        {
            System.out.println(catList.get(k).getName());
        }
        // COMPLETE ME: print each Cat’s name using an
        // enhanced for loop
        for (Cat cat: catList)
        {
            System.out.println(cat.getName());
        }

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        //COMPLETE ME!
        for (int j = 1; j < numList.size() - 1; j++) {
            numList.set(j - 1, numList.get(j) + numList.get(j + 1));
        }

        System.out.println(numList);

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(0, 1);
        ints.add(0, 2);
        ints.add(0, 3);
        ints.add(0, 4);
        ints.add(0, 5);
        ints.add(0, 6);

        ArrayList<Integer> newInts = new ArrayList<Integer>();

        // traverse the entire ints array backwards
        for (int x = ints.size() - 1; x >= 0; x--)
        {
            newInts.add(ints.get(x));
        }

        System.out.println(ints);
        System.out.println(newInts);


    }
}
