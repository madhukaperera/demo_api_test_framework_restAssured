package com.demo.api.e2e.core.functions.api.category;

import com.demo.api.e2e.core.functions.api.BaseFunctions;
import com.demo.api.e2e.core.modle.api.response.category.Category;

import static com.demo.api.e2e.core.common.Constants.API_URL;

public class CategoryFunctions extends BaseFunctions {

    public Category getCategory(String categoryId, boolean isRequiredCatalog) {
        String url = API_URL + "v1/Categories/" + categoryId + "/Details.json?catalogue=" + isRequiredCatalog;
        //ApiResponse apiResponse = httpClient.get(url, null);
        String response = httpClient.get(url, null);
        return (Category) jacksonUtil.convert(response, Category.class);
    }
}
