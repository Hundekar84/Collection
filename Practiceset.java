package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// set do not print the duplicate values
//  null value is allowed
//order is unorderd
public class Practiceset {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(23);
        set.add(12);
        set.add(23);
        set.add(24);
        set.add(74);
        set.add(null);
        System.out.println(set);

        System.out.println("----------------------------------------");
        Set<Integer> set1=new HashSet<>();
        set1.add(23);
        set1.add(12);
        set1.add(23);
        set1.add(24);
        set1.add(74);
        set1.add(null);
        System.out.println(set.equals(set1));
        System.out.println(set1.size());
    }
}
/*
for Hashset
 - duplicate are not allowed
 - null value is allowed
 - order is unorderd

********OUTPUT*************
[null, 23, 24, 74, 12]
########################################
true
5     //size
 */

//===============================================

/*
for LinkedHashet
- insertion order
- Duplicates Values not allowed
- Null values is allowed

[23, 12, 24, 74, null]
----------------------------------------
true
 */
//**********************************************

/*
for Treehashet
- Null values are not allowed
- Duplicates Values not allowed
- Sorted and Ascending Order

[12, 23, 24, 74]
----------------------------------------
true

 */
//************************************************

