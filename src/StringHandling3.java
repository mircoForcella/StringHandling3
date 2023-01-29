public class StringHandling3 {
    public static void main(String[] args) {
        String[] array1 = new String[] { " I want ", " to learn ", " how to code! " };
        String[] array2 = new String[array1.length];
        array2[0] = array1[0].trim();
        array2[1] = array1[1].trim();
        array2[2] = array1[2].trim();
        boolean statement1 = array2[0].compareTo("I want") == 0;
        boolean statement2 = array2[1].compareToIgnoreCase("To learn") == 0;
        
        System.out.println(!(statement1 == statement2));
    }
}
