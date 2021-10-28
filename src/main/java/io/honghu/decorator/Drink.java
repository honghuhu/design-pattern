package io.honghu.decorator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
