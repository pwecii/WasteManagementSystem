class OrganicWasteCollector extends WasteCollector {

    @Override
    public void handleWaste(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("organic")) {
            System.out.println("Organic Waste Collector: Collecting organic waste.");
        } else {
            super.handleWaste(container);
        }
    }
}