class HazardousWasteCollector extends WasteCollector {

    @Override
    public void handleWaste(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("hazardous")) {
            System.out.println("Hazardous Waste Collector: Handling hazardous waste safely.");
        } else {
            super.handleWaste(container);
        }
    }
}