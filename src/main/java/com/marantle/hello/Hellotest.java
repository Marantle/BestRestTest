package com.marantle.hello;

public class Hellotest {

    private final long id;
    private final String content;

    public Hellotest(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}