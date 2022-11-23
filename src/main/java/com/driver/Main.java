package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());

    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addTakeaway();
    dp.getBill();
    dp.getBill();
    System.out.println(dp.getBill());
    //normal pizzagit
    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    //p.addTakeaway();
    System.out.println(p.getBill());
  }
}