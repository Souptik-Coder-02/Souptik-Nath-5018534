public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("001", "Alice", 250.75),
                new Order("002", "Bob", 150.50),
                new Order("003", "Charlie", 300.00),
                new Order("004", "Diana", 100.25)
        };

        System.out.println("Original Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        Order[] bubbleSortedOrders = orders.clone();
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Quick Sort
        Order[] quickSortedOrders = orders.clone();
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}