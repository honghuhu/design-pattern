package io.honghu.builder.improve;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        HouseBuilder commonBuilding = new CommonBuilding();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonBuilding);
        //完成盖房子，返回产品(普通房子)
        House house = houseDirector.constructHouse();
        System.out.println("输出流程: ");
        System.out.println(house.getBaise() + "\n" + house.getWall() + "\n" + house.getRoofed());
        System.out.println("--------------------");
        //盖高楼
        HouseBuilder highBuilding = new HighBuilding();
        //重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成盖房子，返回产品(高楼)
        house = houseDirector.constructHouse();
        System.out.println("输出流程: ");
        System.out.println(house.getBaise() + "\n" + house.getWall() + "\n" + house.getRoofed());
    }
}

class Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
    }
}

