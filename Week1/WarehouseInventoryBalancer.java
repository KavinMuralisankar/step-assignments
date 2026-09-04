public class WarehouseInventoryBalancer {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        for (int x : sectionA) totalA += x;
        for (int x : sectionB) totalB += x;
        int highest = Integer.MIN_VALUE, index = -1;
        char section = 'A';
        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) { highest = sectionA[i]; index = i; section = 'A'; }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highest) { highest = sectionB[i]; index = i; section = 'B'; }
        }
        String status = totalA == totalB ? "Balanced" : "Not Balanced";
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status);
        System.out.println("Highest Quantity: " + highest + " (Section " + section + ", Item " + (index + 1) + ")");
    }
    public static void main(String[] args) { analyzeInventory(new int[]{20,15,30}, new int[]{25,10,30}); }
}
