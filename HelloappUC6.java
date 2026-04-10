public class HelloAppUC6 {
    public static void main(String[] args) {

        // If no arguments, print default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build greeting string
        String names = "";

        // Enhanced for loop to process names
        for (String name : args) {
            names += name + ", ";
        }

        // Remove trailing comma and space using substring
        names = names.substring(0, names.length() - 2);

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}