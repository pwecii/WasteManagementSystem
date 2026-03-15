public class WasteManagementSystem {

    public static void main(String[] args) {

        // Create collectors
        WasteCollector organic = new OrganicWasteCollector();
        WasteCollector recyclable = new RecyclableWasteCollector();
        WasteCollector hazardous = new HazardousWasteCollector();

        // Setup chain
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        // Create containers
        WasteContainer c1 = new WasteContainer("organic", 100, 100);
        WasteContainer c2 = new WasteContainer("recyclable", 80, 80);
        WasteContainer c3 = new WasteContainer("hazardous", 50, 50);

        // Trigger collection
        if (c1.isFull()) organic.handleWaste(c1);
        if (c2.isFull()) organic.handleWaste(c2);
        if (c3.isFull()) organic.handleWaste(c3);
    }
}