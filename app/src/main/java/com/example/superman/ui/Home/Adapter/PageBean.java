package com.example.superman.ui.Home.Adapter;


public class PageBean {
    private String image;
    private String title;

    public PageBean() {

    }

    public PageBean(String image, String title) {
        this.image = image;
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "image='" + image + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
