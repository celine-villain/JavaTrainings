package academy.learning;

import java.util.HashSet;
import java.util.Set;

public class MergeNamess {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> unique = new HashSet<String> ();
        for(String name : names1){
            unique.add(name);
        }
        for(String name : names2) {
            unique.add(name);
        }
        String[] myArray = new String[unique.size()];
        myArray = unique.toArray(myArray);
        return myArray;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNamess.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}