package io.honghu.command;

/**
 * 实现命令接口, 实体
 */
public class SellStock implements Order {
   private Stock stock;
 
   public SellStock(Stock stock){
      this.stock = stock;
   }
 
   @Override
   public void execute() {
      stock.sell();
   }
}