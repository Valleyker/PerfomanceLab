import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Аргументов должно быть 2");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];
        FileReader fr1= new FileReader(file1);
        FileReader fr2= new FileReader(file2);
        Scanner scan1 = new Scanner(fr1);
        Scanner scan2 = new Scanner(fr2);

        String coordOfCircle = scan1.nextLine();
        int x1 = Integer.parseInt(coordOfCircle.split(" ")[0]);
        int y1 = Integer.parseInt(coordOfCircle.split(" ")[1]);
        int r = scan1.nextInt();

        fr1.close();



        while (scan2.hasNextLine()) {
            String coordOfPoint = scan2.nextLine();
            int x2 = Integer.parseInt(coordOfPoint.split(" ")[0]);
            int y2 = Integer.parseInt(coordOfPoint.split(" ")[1]);

            double sqrt = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (r > sqrt) {
                System.out.println(1);
            } else if (r == sqrt) {
                System.out.println(0);
            } else if (r < sqrt) {
                System.out.println(2);
            }

        }

        fr2.close();

    }
}
