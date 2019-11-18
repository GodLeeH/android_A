package com.example.myapplication_study;

public class Content {

    String name;
    String content;


    public Content(String name, String content) {
        this.name = name;
        this.content = content;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Singeritem{" +
                "name='" + name + '\'' +
                ", content='" + content+ '\'' +
                '}';
    }
}
