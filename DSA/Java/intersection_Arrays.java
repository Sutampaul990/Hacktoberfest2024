import java.util.*;

public class intersection_Arrays {
    public static void main (String args[])
    {
        int a[] = {5,10,15,5,10};
        int b[] = {15,10,4};
        System.out.println("Output : " + intersection(a,b));
    }
    public static int intersection(int a[], int b[] )
    {
        int count = 0;
        Set <Integer> set = new HashSet <> ();
        for(int x:a)
            set.add(x);
        
        for(int x:b)
        {
            if(set.contains(x))
            {
                count++;
                set.remove(x);
            }
        }
        return count;
    }
}
