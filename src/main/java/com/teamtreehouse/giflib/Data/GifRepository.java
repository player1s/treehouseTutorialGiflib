package com.teamtreehouse.giflib.Data;

import com.teamtreehouse.giflib.Model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif(1,"android-explosion", LocalDate.of(2015,2,13), "Chris Ramacciotti", false),
            new Gif(2,"ben-and-mike", LocalDate.of(2015,10,30), "Ben Jakuben", true),
            new Gif(3,"book-dominos", LocalDate.of(2015,9,15), "Craig Dennis", false),
            new Gif(1,"compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true),
            new Gif(3,"cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false),
            new Gif(2,"infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );

    public Gif findByName(String name){
        for(Gif gif : ALL_GIFS){
            if(gif.getName().equals(name))
                return gif;
        }
        return null;
    }


    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id)
    {
        List<Gif> gifs = new ArrayList<>();

        for(Gif gif : ALL_GIFS){
            if(gif.getCategoryId() == id)
                 gifs.add(gif);
        }
        return gifs;
    }
}
