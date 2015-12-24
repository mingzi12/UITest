package com.mingzi.uitest;

/**
 * Created by Administrator on 2015/12/24.
 */
public class Data {
    private int imgId;
    private String content;
    public Data(){
    }
    public Data(int imgId,String content){
        this.imgId=imgId;
        this.content=content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
