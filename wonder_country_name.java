import java.util.*;

class WC {
    public static void main(String args[]) {
        String s;
        int i, c = 0;
        String WON[] = {"Taj Mahal", "The Great Wall of China", "The Colosseum in Italy", "Petra in Jordan", "Chichén Itzá in Mexico", "Christ the Redeemer in Brazil", "Machu Picchu in Peru"};
        String CON[] = {"India", "China", "Australia", "England", "Japan", "Italy", "Pakistan"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wonder or country name");
        s = sc.next();
        for (i = 0; i < 7; i++) {
            if (WON[i].equalsIgnoreCase(s)) {
                c++;
                System.out.print(WON[i]);
                System.out.println(" , it is a wonder name");
                break;
            } else {
                if (CON[i].equalsIgnoreCase(s)) {
                    c++;
                    System.out.print(CON[i]);
                    System.out.println(" , it is a country name");
                    break;
                }
            }
        }
        if (c == 0) {
            System.out.println("Not found");
        }
    }
}
