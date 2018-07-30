package ru.testapp.mytestapps;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBook() {

        Book book = new Book();
        ArrayList<String> result = new ArrayList<>();
        result.add("+8 800 2000 500");
        result.add("+8 800 200 600");
        assertEquals(result, book.add("Иванов И.И."));
    }
}