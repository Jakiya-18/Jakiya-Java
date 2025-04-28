package com.tutordude.findOp.Example;

public class Movies {

    String[] movies = new String[5];


    public void addMovies(String film){

        if(film != null){
            if(film.length() >= 3){
                for (int i = 0; i < movies.length ; i++) {
                    if (movies[i] == null) {
                        movies[i] = film;
                        System.out.println("Movie added : " + film);
                        return;
                    }
                }
                System.out.println("Movie list is full, cannot add : " +film);

            }
            else {
                System.out.println("Movie Length should be greater than 5...");
            }
        }
        else {
            System.out.println("Add Movie names");
        }
    }

    public String[] readAll(){
        return movies;
    }

    public boolean find(String name){
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equals(name)){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

}
