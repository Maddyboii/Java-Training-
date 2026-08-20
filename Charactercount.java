public class Charactercount {
    public static void main(String[] args){
        String a = "abkl^&*IoP";
        int Uppercount = 0;
        int lowercount = 0;
        int spl = 0;
       for (char x : a.toCharArray()) {
            if (Character.isLowerCase(x)) {
                lowercount++;
            } 
            else if (Character.isUpperCase(x)) {
                Uppercount++;
            } 
            else {
                spl++;
            }
        }

        System.out.println("The number of Lower case letters are : " + lowercount);
        System.out.println("The number of Upper case letters are : " + Uppercount);
        System.out.println("The number of Special Characters are : " + spl);
    }
}

