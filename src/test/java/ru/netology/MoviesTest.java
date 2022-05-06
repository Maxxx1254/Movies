package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesTest {
    String[] movies = new String[]{
            "first",
            "second",
            "third",
            "forth",
            "fifth",
            "sixth",
            "seventh",
            "eighth",
            "ninth",
            "tenth",
            "eleventh"
    };


    @Test
    public void findAll() {
        Movies mov = new Movies();

        mov.findAll(movies);

        String[] expected = {"first", "second", "third", "forth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh"};
        String[] actual = mov.findAll(movies);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIfMovieBigger() {
        Movies mov = new Movies(10);

        mov.findLast(movies);

        String[] expected = {"eleventh", "tenth", "ninth", "eighth", "seventh", "sixth", "fifth", "forth", "third", "second"};
        String[] actual = mov.findLast(movies);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIfMovieLess() {
        Movies mov = new Movies(13);
        mov.findLast(movies);

        String[] expected = {"eleventh", "tenth", "ninth", "eighth", "seventh", "sixth", "fifth", "forth", "third", "second"};
        String[] actual = mov.findLast(movies);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIfMovieEqual() {
        Movies mov = new Movies(11);
        mov.findLast(movies);

        String[] expected = {"eleventh", "tenth", "ninth", "eighth", "seventh", "sixth", "fifth", "forth", "third", "second"};
        String[] actual = mov.findLast(movies);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie() {
        Movies mov = new Movies();

        String[] expected = {"first", "second", "third", "forth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelve"};
        String[] actual = mov.addMovie(movies);

        assertArrayEquals(expected, actual);
    }
}