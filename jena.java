import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class jena {

    public static void main(String[] args) throws IOException {

        //File rea = new File("Preview attachment output.txtoutput.txt13 KB");

        List<Integer> intList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(new File("/Users/dora/Downloads/output.txt"));
        while (scanner.hasNextInt()) {
            intList.add(scanner.nextInt());

        }


        int[][] arra = new int[9][9];
        int count = 0; //row


        //put into array
        for (int i=0;i<intList.size();i++) {
            if (intList.get(i) == 188) {
                System.out.println(intList.get(i)); //print num
                arra[count][0] = i;
                for (int a=1; a<=8; a++){
                    if(intList.get(i+a) != 188) {
                        System.out.println(intList.get(i + a)); //print num
                        arra[count][a] = i+a;
                    }
                    if(intList.get(i+a) == 188) {
                        break;
                    }
                }

            }
        }

        //print array
        System.out.println(Arrays.deepToString(arra));



    }
}

