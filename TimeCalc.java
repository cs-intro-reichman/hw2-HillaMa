public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt(time.substring(0,2));
        int minutes = Integer.parseInt(time.substring(3,5));
        minutes = (hours * 60) + minutes +  minutesToAdd;
        hours = minutes / 60;
        minutes = minutes - (hours * 60);
        hours = hours % 24;
        if(hours / 10 == 0) {
            if(minutes / 10 == 0){
                System.out.println("0" + hours + ":0" +minutes);
            }
            else{
                System.out.println("0" + hours + ":" +minutes);
            }
        }
        else if(minutes / 10 == 0) {
            System.out.println(hours + ":0" +minutes);
        }
        else {
            System.out.println(hours + ":" +minutes);
        }
    }
}
