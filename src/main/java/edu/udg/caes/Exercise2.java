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
     * @ Cal que cap dels Vectors que rep com a parametre siguin null
     *   Si hi ha repetits els ajuntarà igualment
     *   Si son dos vectors buits retornarà un vector buit
     */
    public static Vector union (Vector a, Vector b)
    {
        Vector<Object> merge = new Vector();
        merge.addAll(a);
        merge.addAll(b);
        return merge;
    }

}
