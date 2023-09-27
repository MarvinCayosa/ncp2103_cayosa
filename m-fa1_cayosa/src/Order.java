// 2. Child Class
// a. Implement single inheritance
class Order extends Pizza {

    // b. Include another data member (modifier - private, string type)
    private static String additionalSides;
    private static int noOfOrders;

    // d. Create a parameterized constructor with one argument
    Order(int quantity) {
        noOfOrders = quantity;
    }

    // f. Create a method called printInfo() that will display the member variable
    public void printInfo(){
        // c. Test the inheritance.
        super.displayInfo();
        System.out.println("Additional Toppings: " + additionalSides); // display the new member variable
    }
    public void printInfo(String name){
        System.out.println("Customer Name: " + name );
    }

    // Override the displayInfo() method. Both shall exist in parent and child class.
    public void displayInfo(){
        System.out.println("Order complete! Thank you.");
    }

    // e. Create a customized getter method to retrieve the value of the member variable
    public String getAdditionalSides() {return additionalSides;}
    public void setAdditionalSides(String additionalTop) {Order.additionalSides = additionalTop;}
    public int getNoOfOrders() {return noOfOrders;}
    public void setNoOfOrders(int quantity) {noOfOrders = quantity;}

}
