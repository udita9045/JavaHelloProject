public class HelloWorld {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String result = "";

        for (String name : args) {
            result += name + ", ";
        }

        // Remove last comma and space
        result = result.substring(0, result.length() - 2);

        System.out.println("Hello, " + result + "!");
    }
}
