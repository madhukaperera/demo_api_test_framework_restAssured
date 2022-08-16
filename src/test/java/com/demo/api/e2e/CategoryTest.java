package com.demo.api.e2e;

import com.demo.api.e2e.core.functions.api.category.CategoryFunctions;
import com.demo.api.e2e.core.modle.api.response.category.Category;
import com.demo.api.e2e.core.modle.api.response.category.Promotion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class CategoryTest extends BaseTest {

    @BeforeClass
    public void beforeClass() {

    }

    @Test
    public void readCategoryTest() {
        Category category = new CategoryFunctions().getCategory("6327", false);
        softAssert.assertEquals(category.getName(), "Carbon credits");
        softAssert.assertTrue(category.getCanRelist());
        validatePromotion(category.getPromotions(), "Gallery", "Good position in category");
        softAssert.assertAll();
    }

    private void validatePromotion(List<Promotion> promotionList, String searchKey, String valueToBePresent) {
        for (Promotion p : promotionList) {
            if (p.getName().equals(searchKey)) {
                softAssert.assertTrue(p.getDescription().contains(valueToBePresent));
            }
        }
    }

}
