package io.honghu.command;

/**
 * 实现命令接口, 实体
 */
public class BuyStock implements Order {
   private Stock stock;
 
   public BuyStock(Stock stock){
      this.stock = stock;
   }
 
   @Override
   public void execute() {
      stock.buy();
   }
}