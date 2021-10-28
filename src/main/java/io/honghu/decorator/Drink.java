package io.honghu.decorator;

public abstract class Drink {

    /**
     * 饮料描述
     */
    private String desc;

    /**
     * 价格
     */
    private float price;

    /**
     * 计算费用的抽象方法
     */
    public abstract float cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
