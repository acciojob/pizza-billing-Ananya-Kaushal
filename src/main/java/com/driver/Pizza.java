package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean isCheeseAddedOnce;
    private Boolean isToppingsAddedOnce;
    private Boolean isTakeAwayAddedOnce;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true)
        {
            price+=300;
            bill=bill+"Base Price Of The Pizza: 300\n";
        }
        else
        {
            price+=400;
            bill=bill+"Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(Boolean isCheeseAddedOnce){
        // your code goes here
        this.isCheeseAddedOnce=isCheeseAddedOnce;
        if(isCheeseAddedOnce==false)
        {
            price+=80;
            isCheeseAddedOnce=true;
        }
        
    }

    public void addExtraToppings(Boolean isToppingsAddedOnce){
        // your code goes here
        this.isToppingsAddedOnce=isToppingsAddedOnce;
        if(isToppingsAddedOnce==false)
        {
            if(this.isVeg==true)
                price+=70;
            else
                price+=120;
            isToppingsAddedOnce=true;
        }
    }

    public void addTakeaway(Boolean isTakeAwayAddedOnce){
        // your code goes here
        this.isTakeAwayAddedOnce=isTakeAwayAddedOnce;
        if(isTakeAwayAddedOnce==false)
        {
            price+=20;
            isTakeAwayAddedOnce=true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
