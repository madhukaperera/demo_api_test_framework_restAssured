package com.demo.api.e2e.core.api;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssuredClient {

    /**
     *
     * @param url
     * @param headersMap
     * @return
     */
    public String get(String url, Map<String, String> headersMap) {
        try {
            String responseBody = given().log().all().headers(headersMap == null ? new HashMap<>() : headersMap)
                    .when().get(new URL(url))
                    .then().log().all()
                    .assertThat().statusCode(200)
                    .extract().asString();
            return responseBody;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
