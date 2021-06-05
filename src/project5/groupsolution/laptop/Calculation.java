package project5.groupsolution.laptop;

import java.util.ArrayList;

public class Calculation {

     /*
        Create method whose name is getRam

        Parameter is ArrayList<String>
        return type is int

        if ram is 32 gb add 300 to price
        if ram is 16 gb add 200 to price
        if ram is 8 gb add 100 to price
        if ram is 4 gb add 50 to price

        return the price.
     */


    /*
       Create method name is getCPU

        return type is int
        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */


    /*
      Create method name is getColor

      Parameter is ArrayList<String>

      return type is int

      if Color is Red add 400 to price
      if Color is Orange add 300 to price
      if Color is Silver add 200 to price
      if Color is Black add 150 to price

      return the price.
   */

    /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */

    public int getRam(ArrayList<String> list){

        int price = 0;
        switch (list.get(2)) {
            case "32 gb":
                price += 300;
                break;
            case "16 gb":
                price += 200;
                break;
            case "8 gb":
                price += 100;
                break;
            case "4 gb":
                price += 50;
                break;
            default:
                price = -1;
        }
        return price;
    }

    public int getCPU(ArrayList<String> list){

        int price = 0;
        switch (list.get(3)) {
            case "i3":
                price += 200;
                break;
            case "i5":
                price += 300;
                break;
            case "i7":
                price += 500;
                break;
            default:
                price = -1;
        }
        return price;
    }

    public int getColor(ArrayList<String> list){

        int price = 0;
        switch (list.get(4)) {
            case "Red":
                price += 400;
                break;
            case "Orange":
                price += 300;
                break;
            case "Silver":
                price += 200;
                break;
            case "Black":
                price += 150;
                break;
            default:
                price = -1;
        }
        return price;
    }

    public int getSize(ArrayList<String> list){

        int price = 0;
            if(list.get(1).contains("Mini")){
                price += 100;
            }else if(list.get(1).contains("Middle")){
                price += 200;
            }else if(list.get(1).contains("Max")){
                price += 300;
            }
        return price;
    }
}
