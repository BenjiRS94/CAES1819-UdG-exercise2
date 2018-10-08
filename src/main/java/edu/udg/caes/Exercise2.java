package edu.udg.caes;

import java.util.Set;
import java.util.Vector;

public class Exercise2 {

    /**
     * Vector union operation
     *
     *  @param a first vector
     *  @param b second vector
     *  @return objects that are in either one of the two argument vectors
     */
    public static Vector union (Vector a, Vector b)
    {
        Vector<Object> merge = new Vector();
        merge.addAll(a);
        merge.addAll(b);
        return merge;
    }

}
