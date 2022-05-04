package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesTest {

    @Test
    public void findAll() {
        Movies mov = new Movies();
        mov.findAll();

        String[] expected = {"first", "second", "third", "forth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh"};
        String[] actual = mov.findAll();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast() {
        Movies mov = new Movies(10);
        mov.findLast();

        String[] expected = {"eleventh", "tenth", "ninth", "eighth", "seventh", "sixth", "fifth", "forth", "third","second"};
        String[] actual = mov.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie() {
        Movies mov = new Movies();

        String[] expected = {"first", "second", "third", "forth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelve"};
        String[] actual = mov.addMovie("twelve");

        assertArrayEquals( expected, actual);
    }
}