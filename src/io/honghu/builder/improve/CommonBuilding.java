package io.honghu.builder.improve;

/**
 * 盖普通房子
 */
public class CommonBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        house.setBaise("----- 普通房子地基5米");
    }

    @Override
    public void buildWalls() {
        house.setWall("----- 普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("----- 普通房子屋顶");
    }

}
