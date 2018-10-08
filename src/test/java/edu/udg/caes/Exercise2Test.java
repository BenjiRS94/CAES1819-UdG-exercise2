package edu.udg.caes;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test {

    @Test
    public void test_union_emptyVectors() {
        Vector v1 = new Vector();
        Vector v2 = new Vector();

        Vector result = Exercise2.union(v1, v2);

        assertEquals(result, new Vector());
    }

    @Test
    public void test_union_notNullVectors() {
        Vector v1 = null;
        Vector v2 = null;

        assertThrows(NullPointerException.class, () -> {
            Exercise2.union(v1, v2);
        });
    }

    @Test
    public void test_union_addSameElements() {

        Vector v1 = new Vector();
        v1.add(1);
        Vector v2 = new Vector();
        v2.add(1);
        Vector expected = new Vector();
        expected.add(1);
        expected.add(1);

        Vector result = Exercise2.union(v1, v2);

        assertEquals(result, expected);
    }

    @Test
    public void test_union_addElements() {

        Vector v1 = new Vector();
        v1.add(1);
        Vector v2 = new Vector();
        v2.add(2);
        Vector expected = new Vector();
        expected.add(1);
        expected.add(2);

        Vector result = Exercise2.union(v1, v2);

        assertEquals(result, expected);
    }

    @Test
    public void test_union_acceptDiferentType() {

        Vector v1 = new Vector();
        v1.add(1);
        Vector v2 = new Vector();
        v2.add("halo");
        Vector expected = new Vector();
        expected.add(1);
        expected.add("halo");

        Vector result = Exercise2.union(v1, v2);

        assertEquals(result, expected);
    }




}
