// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {   
            String name = args[0];
            name = name.toUpperCase();
            int cheerTime = Integer.parseInt(args[1]);
            String addAn = "AEFHILMNORSX";
            int i = 0;
            while(i < name.length()) {
                if(addAn.indexOf(name.charAt(i)) == -1) {
                        System.out.println("Give me a  " + name.charAt(i) + ": " + name.charAt(i) + "!");
                }
                else {
                        System.out.println("Give me an " + name.charAt(i) + ": " + name.charAt(i) + "!");
                }
                i++;
            }
            System.out.println("What does that spell?");
            while(cheerTime > 0) {
                System.out.println(name + "!!!");
                cheerTime--;
            }
        }
}
