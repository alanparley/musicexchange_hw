import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {


    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<ISell> getStockcount(){
        return this.stock;
    }

    public void addToStock(ISell stock){
            this.stock.add(stock);
        }

    public void removeFromStock(ISell stock){
        this.stock.remove(stock);
    }
    }


