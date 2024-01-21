package genericsLambdas;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


//Add a type parameter to the Inventory class to say that it works with a generic type
public class Inventory<T> {

//Define a list instance variable that takes a generic type parameter
    private List<T> items;

//Define a public constructor with no parameters that sets the list instance variable to an empty list
//(you can choose the type of list you want)
    public Inventory(){
        this.items = new ArrayList<>();
    }


//Define a function that returns all items in the list instance variable
    public List<T> getItems(){
        return items;
    }

//Define a function that takes an item of any type as input and adds it to the list
    public void addItem(T item){
        this.items.add(item);
    }

//Define a function that takes an item of any type as input, removes it from the list, and then returns
//the updated list
    public List<T> removeItem(T item){
//        return this.items.stream().filter((curr) -> !curr.equals(item)).collect(Collectors.toList());
        items.remove(item);
        return items;
    }

//Define a function that returns the number of items currently in the list

    public int countItems(){
        return items.size();
    }


}