package com.skole;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> moviesList = new ArrayList<>();
        //Instantieing af objekter fra en klasse som har nogle variabler - bruges senere
        //Arraylist som læser objekterne ind i en liste der skal anvendes til Stream og Lambada
        moviesList.add(new Movie("DieHard",1000,1995,120.5));
        moviesList.add(new Movie("DieHard2",500,2000,123.5));
        moviesList.add(new Movie("Pirates",1276,2004,113.3));
        moviesList.add(new Movie("Joker",3000,2019,140.7));
        moviesList.add(new Movie("TheGreatGatsby",4000,2008,102.7));


        //Arraylist som læser objekterne ind i en liste der skal anvendes til Stream og Lambada

        /*moviesList.add(movie1);
        moviesList.add(movie2);
        moviesList.add(movie3);
        moviesList.add(movie4);
        moviesList.add(movie5);*/


        // for loop til at udskrive listen
        for (Object o : moviesList)
            System.out.println(o);


        //Et stream som filtrer filme efter årgang ved brug af lambda
        List<Movie> movieStream = moviesList.stream()
                .filter(Movie -> Movie.getProdYear() ==2004 )
                .collect(Collectors.toList());
        System.out.println("\n |||||Movie stream som finder udgivelses år i 2004:");
        System.out.println("\n" +  movieStream);


        //Et stream som filtrer filme efter årgang ved brug af lambda(og predefineret metode)
        List<Movie> moviesAfter2000Stream = moviesList.stream()
                .filter(Movie ::getMoviesAfter2000)
                .collect(Collectors.toList());
        System.out.println("\n |||||Movie stream som finder udgivelses efter år  2004:");
        for (Object l : moviesAfter2000Stream)
            System.out.println("\n" + l);


        ZeroArgument za = () -> System.out.println("Hej");
        za.Func();

        OneArgument oa = e -> System.out.println(e);
        oa.oneFunc("hhjbhbkjbkb");

        TwoArgument ta = (t,u) -> t + u;
        ta.plus(20,20);
        System.out.println(ta.plus(20,20));




        /*List<Movie> filteredMovieStream = moviesList.stream()
                .filter(Movie)*/




    }
}
