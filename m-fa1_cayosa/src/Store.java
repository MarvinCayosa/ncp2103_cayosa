// 3
// Modify your source code to implement multilevel inheritance.
class Store extends Order {
    public String pizzaStore;
    Store() {
        super(0);
    }
    public void selectStore(String pizzaStore){
        System.out.println("Store: " + pizzaStore);
    }
}