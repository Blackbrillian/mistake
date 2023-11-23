package ru.netology.stats;

public class MovieManager {
    private String[] movies = new String[0];
    private int limit;


    public MovieManager() {
        this.limit = 5;

    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[1] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        String[] tmp = new String[5];
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[1] = movies[movies.length - 1 - i];
        }
        return tmp;

    }

}
