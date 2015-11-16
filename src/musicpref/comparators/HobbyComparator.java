package musicpref.comparators;

import java.util.Comparator;
import musicpref.*;

/**
 * Comparator to compare the hobby parameter of two given Student objects.
 * 
 * @author Alec Alderman (ama2106)
 * @author Julian Davila (jaydee1)
 * @author Matthew Scanland (mks2752)
 * @version 2015.11.16
 */
public class HobbyComparator implements Comparator<Student> {

    /**
     * Compare the given students' hobbies and return a numerical result.
     * 
     * @param s1 - first Student object for comparison
     * @param s2 - second Student object for comparison
     * @return an integer result based on the comparison
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getHobby().compareTo(s2.getHobby());
    }

}
