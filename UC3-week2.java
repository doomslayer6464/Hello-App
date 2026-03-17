public class HelloWorld {

    public static void main(String[] args) {
        String name;

        // Check if a command-line argument is provided
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World"; // default value
        }

        // Display greeting
        System.out.println("Hello " + name);
    }
}