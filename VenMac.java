//UNCOMMENT EVERYTHING BELOW WHEN YOU HAVE COMPLETED THE PREVIOUS 3 PARTS.

import java.util.ArrayList;
public class VenMac{
    ArrayList<Drink> stock;

    String[] drinkNames = {"Coke","Diet Coke","Water","Mountain Dew","Iced Tea"};

    //The constructor for a venMach is  below. This code is ran everytime a venMachine is created.
    public VenMac(){
        stock = new ArrayList<Drink>();
        int ranQuant =(int)(Math.random()*3+1);
        
        for(int i=0;i<(int)(Math.random()*4+1);i++){
            double randPrice = (Math.random()*4+1);
            double roundedPrice = (double)((int)(randPrice*100))/100;
            for(int j=0;j<ranQuant;j++){
                stock.add(new Drink(drinkNames[(int)(Math.random()*drinkNames.length)],roundedPrice,true,true));
            }
        }
        
        listContents();
    }


    public void listContents(){
        for(int i=0;i<stock.size();i++){
            System.out.println("Item #: "+ i +" Item name: "+ stock.get(i).getName()+ " Price: "+stock.get(i).getPrice());
        }
    }


}