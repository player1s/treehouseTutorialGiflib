package com.teamtreehouse.giflib.Data;

import com.teamtreehouse.giflib.Model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "balaton"),
            new Category(2, "tisza"),
            new Category(3, "bakony")
    );

    public List<Category> getALL_CATEGORIES(){
        return ALL_CATEGORIES;
    }

    public Category findById(int id)
    {
        for(Category category : ALL_CATEGORIES) {
            if(id == category.getId())
                return category;
        }
        return null;
    }
}
