package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void _18_x_18_should_be_324() {
        Rectangle rec = new Rectangle();
        rec.setHeight(18);
        rec.setWidth(18);
        Assert.assertEquals(324, rec.getArea(), 0);

    }

    @Test
    public void _Duplicate_titles_should_not_be_allowed_for_author() {
        Author aut1 = new Author("Kalle Grubbson");
        Book[] books = new Book[3];
        books[0] = new Book(aut1, "sea1");
        books[1] = new Book(aut1, "sea1");
        books[2] = new Book(aut1, "sea3");

        for(Book b: books) {
            aut1.addBook(b);
        }
        boolean b = Arrays.equals(books, aut1.getBook());

        Assert.assertFalse(b);

    }
}
