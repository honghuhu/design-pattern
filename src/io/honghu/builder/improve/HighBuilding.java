package io.honghu.builder.improve;

/**
 * 盖高楼
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        house.setBaise("----- 高楼地基100米");
    }

    @Override
    public void buildWalls() {
        house.setWall("----- 高楼的砌墙20cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("----- 高楼透明屋顶");
    }

}
