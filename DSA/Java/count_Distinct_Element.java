import java.util.*;

public class count_Distinct_element {
    public static void main (String args[])
    {
        int arr[] = {5,10,5,4,5,10};
        countDistinct(arr);
    }
    public static void countDistinct(int [] arr)
    {
        Set <Integer> set = new HashSet<>();
        for(int element : arr)
            set.add(element);
        System.out.print("Output : ");
        System.out.print(set.size());
    }
}
