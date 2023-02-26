import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] floors = {"Parking-2","Parking-1","Parter","F1","F2","F4","F5","F6","F7","F8"};
        int i = 2;
        String lift = floors[i];

        System.out.println("Please call button");
        String callButtonName = sc.nextLine();

        int callButton = getIndexByValue(callButtonName, floors);

        if (callButton == 999) {
            callButton = i;
        }
        while(i <= callButton) {
            i++;
            System.out.println(lift);
            lift = floors[i];
        }
        System.out.println("Doors is open ");
    }

    private static int getIndexByValue(String callButtonName, String[] floors) {
        for (int i = 0; i < floors.length; i++) {
            if (callButtonName.equals(floors[i])) {
                return i;
            }
        }
        return 999;

    }
}

// zebra(ds):

// def zebra(a, b):
//     fsdfsd dfs dfdf
    



