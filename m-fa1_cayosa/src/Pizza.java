// 1
class Pizza {
    // a. Include three member variables (modifier - private, string type, and int type)
    private static String toppings;
    private static String crust;
    private static int size; //inches

    // b. Include customized setter and getter methods

    // getters
    public String getToppings() {return toppings;}
    public String getCrust() {return crust;}
    public int getSize() {return size;}
    // setters
    public void setToppings(String toppings) {Pizza.toppings = toppings;}
    public void setCrust(String crust) {Pizza.crust = crust;}
    public void setSize(int size){Pizza.size = size;}

    // c. Include methods called displayInfo() to show the value of the member variables
    public void displayInfo(){

        System.out.println("-".repeat(50) + "\nYour Order");
        System.out.println("Toppings: " + toppings);
        System.out.println("Crust Type: " + crust);
        System.out.println("Size (inches): " + size);
    }

}

