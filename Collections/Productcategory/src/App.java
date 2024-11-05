
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<Category> categories = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n1. Add Category");
            System.out.println("2. Add Product to Category");
            System.out.println("3. Display Categories and Products");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter category name: ");
                    String categoryName = scanner.nextLine();
                    categories.add(new Category(categoryName));
                    break;

                case 2:
                    System.out.print("Enter category name to add product: ");
                    String catName = scanner.nextLine();
                    Category category = categories.stream()
                        .filter(c -> c.getName().equalsIgnoreCase(catName))
                        .findFirst()
                        .orElse(null);
                    if (category != null) {
                        System.out.print("Enter product name: ");
                        String productName = scanner.nextLine();
                        System.out.print("Enter product price: ");
                        double productPrice = scanner.nextDouble();
                        category.addProduct(new Product(productName, productPrice));
                    } else {
                        System.out.println("Category not found.");
                    }
                    break;

                case 3:
                    if (categories.isEmpty()) {
                        System.out.println("No categories available.");
                    } else {
                        for (Category c : categories) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
