package com.movieflix.Mapper;

import com.movieflix.entity.Category;
import com.movieflix.response.CategoryResponse;
import com.movieflix.request.CategoryRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CategoryMapper {

    public static Category toCategory(CategoryRequest categoryRequest) {
    return Category
            .builder()
            .name(categoryRequest.name())
            .build();
    }

    public static CategoryResponse toCategoryResponse(Category category) {
        return CategoryResponse
                .builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}
