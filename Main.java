class Main {

    public static void main(String[] args) {
        
      
        /*UberX uberX = new UberX("KOD447", new Account("Ana Rodriguez", "SES587"), "HYUNDAI", "RLA2");
        uberX.setPassenger(4);
        uberX.printDataCar();*/

        UberVan uberVan = new UberVan("FJH123", new Account("Miguel Saldarriaga", "SES587"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

       
        UberBlack uberBlack = new UberBlack("KKD0797", new Account("Lola Calamidades", "DIE459"));
        uberBlack.setPassenger(4);
        uberBlack.printDataCar();
        

       
        /*Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.setPassenger(2);
        car.printDataCar();*/

       
        /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "DND123"));
        car2.setPassenger(4);
        car2.printDataCar();*/

         /*Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        //car.setPassenger(2);
        //car.printDataCar();*/

       
    }
}