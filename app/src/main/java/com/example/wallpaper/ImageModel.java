package com.example.wallpaper;

public class ImageModel {

    private UrlModel src;

    public UrlModel getSrc() {
        return src;
    }

    public void setSrc(UrlModel src) {
        this.src = src;
    }

    public ImageModel(UrlModel src) {
        this.src = src;
    }
}
