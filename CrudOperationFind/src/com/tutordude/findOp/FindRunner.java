package com.tutordude.findOp;

import com.tutordude.findOp.Example.Movies;

public class FindRunner {

    public static void main(String[] args) {


        Movies movies = new Movies();

        movies.addMovies("Avengers");
        movies.addMovies("Kantara");
        movies.addMovies("Vivah");
        movies.addMovies("Tarzan");
        movies.addMovies("ha");

        String[] read = movies.readAll();
        for (int i = 0; i < read.length; i++) {
            System.out.println(read[i]);
        }

        boolean result = movies.find("Black pantar");
        System.out.println("Movies found : " +result);

        //boolean result1= movies.update("ha", "The Maze Runner");
        //System.out.println(result1);




        }

    }
