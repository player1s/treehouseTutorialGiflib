package com.teamtreehouse.giflib.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gifs")
    @ResponseBody
    public String listSpecGif() {
        return "whatnot in a specific way";
    }

}
