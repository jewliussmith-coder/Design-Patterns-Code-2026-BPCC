public abstract class VehicleReport {

    public final void generateReport() {
        collectData();
        formatReport();

        if (shouldCheckMaintenance()) {
            performMaintenanceCheck();
        }

        logStatus();
    }

    protected void collectData() {
        System.out.println("Fetching GPS data...");
    }

    protected abstract void formatReport();

    protected boolean shouldCheckMaintenance() {
        return false;
    }

    protected void performMaintenanceCheck() {
        System.out.println("Performing standard maintenance check.");
    }

    protected void logStatus() {
        System.out.println("Log entry created.");
    }
}
