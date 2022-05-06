package ru.netology;


public class Movies {
    private String[] movies;
    private int lastMovies;
    private  String movie;


    public Movies(String[] movies) {
        this.movies = movies;
    }

    public Movies() {
    }

    public Movies(int lastMovies) {

        this.lastMovies = 10;
    }


    public String[] addMovie(String[] movies) {

        String newMovie = new String("twelve");
        int length = movies.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;

        movies = tmp;
        return movies;
    }

    public String[] findLast(String[] movies) {

        int fistMovies = movies.length - lastMovies;

        String[] tmp = new String[movies.length - fistMovies];
        int index = 0;
        for (int i = movies.length - 1; i > fistMovies - 1; i = i - 1) {
            tmp[index] = movies[i];
            index++;
        }
        return tmp;
    }

    public String[] findAll(String[] movies) {
        return movies;
    }
}