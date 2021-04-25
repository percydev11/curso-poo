import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {

    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, 
    Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberBlack(String license, Account driver) {
        super(license, driver);

    }

    public void setPassenger(Integer passenger) {

        if (passenger == 4) {
            super.setPassenger(passenger);
        } else {
            System.out.println("UberX needs 4 passengers assigned");
        }

    }

    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        
    }

}
