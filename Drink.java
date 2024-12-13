public class Drink{
  //PART 1
    //Create attributes for the drink class here.
      
    /* Give it attirbutes:
    name
    price with decimals
    if it's cold or not (isCold)
    if it's empty (isEmpty)
    */
    private double price;
    private boolean isCold;
    private boolean isEmpty;
    
    
    //Write the constructor for the Drink class. (THIS IS WHAT CREATES an object when its run in the main) 
    //the order for the parameters must be (String, double, boolean, boolean)
    //After creating a constructor test your code in the main to see if you can create some drink.
    public Drink(double p, boolean c, boolean e){
      price = p;
      isCold = c;
      isEmpty = e;
    }
    
    
    
    
      //Write getters/setters for the methods
    public void getPrice(){
      return price;
    }

  public void getCold(){
      return isCold;
    }

  public void getEmpty(){
      return isEmpty;
    }
    
    
    

    // Write the method emptyDrink which prints out the message: NameOfDrink "has been drank" and then changes the attribute to be empty
    public String emptyDrink(Drink d){
      System.out.println(name + " has been drunk.");
      d.isEmpty = true;
      return d;
    }
      
    }
