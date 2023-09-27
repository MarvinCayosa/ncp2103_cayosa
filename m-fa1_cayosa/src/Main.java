public class Main {
    public static void main(String[] args) {
        System.out.println("PIZZA ORDER DELIVERY FORM \n");

        // Instantiation 1
        Order overloading = new Order(2);
        overloading.printInfo("Marvin");

        // Instantiation 2
        Store selectedStore = new Store();
        selectedStore.selectStore("Pizza Hut");

        // Instantiation 3
        DeliveryAddress userOrder1 = new DeliveryAddress(2);
        userOrder1.deliveryAdd("University of The East Manila");
        userOrder1.setToppings("Ham, Cheese, Bacon");
        userOrder1.setCrust("Thick");
        userOrder1.setSize(14);
        userOrder1.setAdditionalSides("None");
        userOrder1.printInfo();
        System.out.println("Quantity: " + userOrder1.getNoOfOrders());

        // Instantiation 4
        Order overriding = new Order(1);
        overriding.displayInfo();

        System.out.println("=".repeat(50));





    }
}