package com.demo.api.e2e.core.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

public class Constants {

    private static final Properties properties = new Properties();

    /**
     * Load the property file at class loading time
     */
    static {
        String resourceName = "configs.properties";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
            properties.load(resourceStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final String API_URL = Optional.ofNullable(properties.getProperty("api.url")).orElse("");


}
