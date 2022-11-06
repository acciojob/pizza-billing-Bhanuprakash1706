package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraToppingPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isBillGenerated;
    private boolean isPaperBagAdded;
    private int extraCheese;
    private int paperBagPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.paperBagPrice=20;
        this.extraCheese=80;
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isBillGenerated=false;
        this.isPaperBagAdded=false;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.extraToppingPrice=70;
        }else{
            this.price=400;
            this.extraToppingPrice=120;
        }
        bill="Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
            if(isCheeseAdded==false){
                this.price+=extraCheese;
                isCheeseAdded=true;
            }
           // bill+="Extra Cheese Added: "+extraCheese+"\n";
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price+=extraToppingPrice;
            isToppingAdded=true;
        }
        //bill+="Extra Toppings Added: "+extraToppingPrice+"\n";
    }

    public void addTakeaway(){
        // your code goes here
        if (isPaperBagAdded==false){
        this.price+=this.paperBagPrice;
        this.isPaperBagAdded=true;}
       // bill+="Paperbag Added: "+paperBagPrice+"\n";
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated==false) {
            if(isCheeseAdded==true){
                bill+="Extra Cheese Added: "+extraCheese+"\n";
            }
            if(isToppingAdded==true){
                bill+="Extra Toppings Added: "+extraToppingPrice+"\n";
            }
            if(isPaperBagAdded==true){
                bill+="Paperbag Added: "+paperBagPrice+"\n";
            }
            bill += "Total Price: " + price + "\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
