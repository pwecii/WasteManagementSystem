class RecyclableWasteCollector extends WasteCollector {

    @Override
    public void handleWaste(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("recyclable")) {
            System.out.println("Recyclable Waste Collector: Collecting recyclable waste.");
        } else {
            super.handleWaste(container);
        }
    }
}