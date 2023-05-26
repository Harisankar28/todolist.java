import java.util.ArrayList;
import java.util.Scanner;

public class dolist {
    private ArrayList<String> items;

    public dolist() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println("Added '" + item + "' to the to-do list.");
    }

    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Removed '" + item + "' from the to-do list.");
        } else {
            System.out.println("'" + item + "' is not found in the to-do list.");
        }
    }

    public void viewList() {
        if (items.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
        }
    }

    public static void main(String[] args) {
        dolist todoList = new dolist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== TO-DO LIST MANAGER ====");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View list");
            System.out.println("4. Quit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String addItem = scanner.nextLine();
                    todoList.addItem(addItem);
                    break;
                case 2:
                    System.out.print("Enter the item to remove: ");
                    String removeItem = scanner.nextLine();
                    todoList.removeItem(removeItem);
                    break;
                case 3:
                    todoList.viewList();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
