package com.teamtreehouse.giflib.Controller;

import com.teamtreehouse.giflib.Data.CategoryRepository;
import com.teamtreehouse.giflib.Data.GifRepository;
import com.teamtreehouse.giflib.Model.Category;
import com.teamtreehouse.giflib.Model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        List<Category> allCategories = categoryRepository.getALL_CATEGORIES();
        modelMap.put("categories", allCategories);
        return "categories";
    }
    @RequestMapping("/category/{id}")
    public String Category(@PathVariable int id, ModelMap modelMap){

        Category category = categoryRepository.findById(id);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepository.findByCategoryId(id);
        modelMap.put("gifs", gifs);

        return "category";
    }
}
