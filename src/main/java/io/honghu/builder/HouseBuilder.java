package io.honghu.builder;

/**
 * 建造者抽象
 */
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 建造地基
     */
    public abstract void buildBasic();

    /**
     * 建造墙壁
     */
    public abstract void buildWalls();

    /**
     * 建造屋顶
     */
    public abstract void roofed();

    /**
     * 返回建造好的房子
     */
    public House buildHouse() {
        return house;
    }

}
