package ru.netology;


public class Movies {
    private String[] movies = {
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
    private int lastMovies;

    public Movies() {
    }
    public Movies(int lastMovies) {

        this.lastMovies = 10;
    }

    public String[] addMovie(String newMovie) {

        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;

        movies = tmp;
        return tmp;
    }
    public String[] findLast() {
        int j = movies.length - lastMovies;

        String[] tmp = new String[movies.length - j];
        int index = 0;
        for (int i = movies.length - 1; i > j - 1;i = i -1) {
            tmp[index] = movies[i];
            index++;
        }
        return tmp;
    }

    public String[] findAll() {
        return movies;
    }
}