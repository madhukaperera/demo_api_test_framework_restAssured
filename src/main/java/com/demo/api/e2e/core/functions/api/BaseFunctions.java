package com.demo.api.e2e.core.functions.api;

import com.demo.api.e2e.core.api.JacksonUtil;
import com.demo.api.e2e.core.api.RestAssuredClient;

/**
 * Base class for all the API level function implementations. All the API function classes should be inherit from this class.
 */
public class BaseFunctions {

    protected JacksonUtil jacksonUtil = new JacksonUtil();
    protected RestAssuredClient httpClient = new RestAssuredClient();
}
