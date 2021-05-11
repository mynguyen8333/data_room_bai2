package com.example.database_room_bai2;

import java.io.Serializable;

public class Dulich implements Serializable {
    private int img_sua,img_xoa;
    private String tv_name;

    public int getImg_sua() {
        return img_sua;
    }

    public void setImg_sua(int img_sua) {
        this.img_sua = img_sua;
    }

    public int getImg_xoa() {
        return img_xoa;
    }

    public void setImg_xoa(int img_xoa) {
        this.img_xoa = img_xoa;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public Dulich(int img_sua, int img_xoa, String tv_name) {
        this.img_sua = img_sua;
        this.img_xoa = img_xoa;
        this.tv_name = tv_name;
    }
}
