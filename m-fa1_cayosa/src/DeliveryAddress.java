// 4
// Modify your source code to implement hierarchical inheritance.
class DeliveryAddress extends Order {
    DeliveryAddress (int quantity){
        super(quantity);
    }
    public void deliveryAdd(String address) {
        System.out.println("Address: " + address);
    }

}