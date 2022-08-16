package com.demo.api.e2e.core.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonUtil {

    private final ObjectMapper objectMapper;

    public JacksonUtil() {
        objectMapper = new ObjectMapper();
    }

    /**
     * Deserialize json string to object
     *
     * @param jsonString
     * @param type
     * @return Deserialized java.lang.Object
     */
    public Object convert(String jsonString, Class<?> type) {
        try {
            if (jsonString == null) {
                return null;
            } else {
                return objectMapper.readValue(jsonString, type);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Serialize json object to string
     *
     * @param value Json object
     * @return Serialized java.lang.String
     */
    public String convertToString(Object value) {
        try {
            return objectMapper.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
