public class UberPool extends Car {

    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
       
    }

    public UberPool(String license, Account driver) {
        super(license, driver);

    }

    public void setPassenger(Integer passenger) {

        if(passenger == 4) {
            super.setPassenger(passenger);;
        } else {
            System.out.println("UberPool needs 4 passengers assigned");
        }
    }

}