package logicalPrograms;

public class HexStringSearch {
    public static void main(String[] args) {
        String mainString = "RAMKUMAR";
        String hexString = "52414D";

        int index = findHexStringIndex(mainString, hexString);
        System.out.println("Index of hex String  is "+  index);
    }

    public static int findHexStringIndex(String mainString, String hexString) {
    	String output="";

        for (int i = 0; i < hexString.length(); i += 2) {
            String str = hexString.substring(i, i + 2);
            output=output+((char) Integer.parseInt(str, 16));
            System.out.println(output);
        }
        return mainString.indexOf(output);
    }

}


