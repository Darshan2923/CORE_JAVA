import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections_in_java {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                return -1;
            }
        };
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(5);
        nums.add(7);
        nums.add(8);

        System.out.println(nums.get(2));

        System.out.println(nums);

        Collections.sort(nums, comp);
        System.out.println(nums);

        Set<Integer> nums2 = new HashSet<Integer>();
        nums2.add(8);
        nums2.add(6);
        nums2.add(5);
        nums2.add(7);
        nums2.add(5);
        System.out.println(nums2);

        Map<String, Integer> nums3 = new HashMap<String, Integer>();
        nums3.put("Darshan", 123);
        nums3.put("Hit", 124);
        nums3.put("Adak", 125);

        System.out.println(nums3);
        System.out.println(nums3.get("Darshan"));
        for (String key : nums3.keySet()) {
            System.out.println(key + ": " + nums3.get(key));
        }
    }
}
