public class Main {
    public static void main(String[] args) {
        VehicleReport truck = new TruckReport();
        truck.generateReport();

        System.out.println();

        VehicleReport bike = new BikeReport();
        bike.generateReport();
    }
}
