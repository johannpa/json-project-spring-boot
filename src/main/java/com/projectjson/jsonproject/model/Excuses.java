package com.projectjson.jsonproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Excuses
{
    @JsonIgnore
    private Long http_code;

    private String tag;
    private String message;

    public Excuses() {
    }

    public Excuses(Long http_code, String tag, String message) {

        this.http_code = http_code;
        this.tag = tag;
        this.message = message;
    }

    public Long getHttp_code() {
        return http_code;
    }

    public String getTag() {
        return tag;
    }

    public String getMessage() {
        return message;
    }
}
