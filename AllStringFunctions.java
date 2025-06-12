public class AllStringFunctions {
    public static void main(String[] args) {
        String s1 = "  Hello Java  ";
        String s2 = "hello java";
        String s3 = "Welcome,to,String,World";

        // 1. length()
        System.out.println("Length: " + s1.length());

        // 2. toUpperCase(), toLowerCase()
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        // 3. trim()
        System.out.println("Trimmed: '" + s1.trim() + "'");

        // 4. equals() and equalsIgnoreCase()
        System.out.println("Equals: " + s1.equals(s2));               // false
        System.out.println("EqualsIgnoreCase: " + s1.trim().equalsIgnoreCase(s2)); // true

        // 5. charAt(index)
        System.out.println("Char at 1: " + s1.charAt(1));

        // 6. substring(start, end)
        System.out.println("Substring (0, 5): " + s1.substring(0, 5));

        // 7. indexOf(), lastIndexOf()
        System.out.println("Index of 'a': " + s1.indexOf('a'));
        System.out.println("Last index of 'a': " + s1.lastIndexOf('a'));

        // 8. contains()
        System.out.println("Contains 'Java': " + s1.contains("Java"));

        // 9. replace()
        System.out.println("Replace 'Java' with 'World': " + s1.replace("Java", "World"));

        // 10. startsWith(), endsWith()
        System.out.println("Starts with '  He': " + s1.startsWith("  He"));
        System.out.println("Ends with 'va  ': " + s1.endsWith("va  "));

        // 11. isEmpty()
        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());

        // 12. split()
        String[] parts = s3.split(",");
        System.out.println("Splitting by ',' :");
        for (String part : parts) {
            System.out.println("→ " + part);
        }

        // 13. compareTo() and compareToIgnoreCase()
        System.out.println("CompareTo: " + s1.compareTo(s2));              // case-sensitive
        System.out.println("CompareToIgnoreCase: " + s1.compareToIgnoreCase(s2)); // case-insensitive
    }
}
