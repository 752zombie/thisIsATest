import java.util.ArrayList;

public class Main {

    private static String test;

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hej");
        stringArrayList.add("med");
        stringArrayList.add("dig");
        Main main = new Main();
        System.out.println(main.ContainsString(stringArrayList, "md"));
    }

    public boolean ContainsString(ArrayList<String> stringArrayList, String stringToFind) {
        for (int i = 0;i < stringArrayList.size(); i++) {
            if (stringArrayList.get(i).equals(stringToFind)) {
                return true;
            }
        }

        return false;
    }
}
