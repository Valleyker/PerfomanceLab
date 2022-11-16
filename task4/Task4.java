import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Аргумент должен быть 1");
            return;
        }
        FileReader fr= new FileReader(args[0]);
        Scanner scan = new Scanner(fr);
        ArrayList<Integer> arr = new ArrayList<>();

        while (scan.hasNextLine()) {
            arr.add(scan.nextInt());
        }
        fr.close();

        Collections.sort(arr);

        int avg = arr.get(arr.size() / 2);
        int answer = 0;

        for (int i : arr) {
            answer += Math.abs(i - avg);
        }

        System.out.println(answer);
    }
}
