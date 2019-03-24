package com.teamtreehouse.giflib.Controller;

import com.teamtreehouse.giflib.Data.GifRepository;
import com.teamtreehouse.giflib.Model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gifs")
    public String listSpecGif(ModelMap modelMap) {
        Gif gif = gifRepository.findByName("cowboy-coder");
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
