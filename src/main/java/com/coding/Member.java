package com.coding;

public class Member {


    private  int Point;


    public int getPoint() {
        return Point;
    }

    public void recharge(int i) {
        if(i==56){
            Point=60;
        }else if(i==68){
            Point=90;
        }else if (i==168){
            Point=200;
        }
    }


}
