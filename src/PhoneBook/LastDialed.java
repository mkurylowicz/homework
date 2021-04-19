package PhoneBook;

import java.util.Scanner;

public class LastDialed {
    public static void main(String[] args) {
       /* int[] lastDialed = new int[10];
        System.out.println("Podaj 10 liczb do tablicy: ");
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<10; i++)
            lastDialed[i] = scan.nextInt();*/


        int[] lastDialed = {1,2,3,4,5,6,7,8,9,0};
        int index = 8;
        int id = 13;


        //System.out.println(getLastDialed(lastDialed));
        //System.out.println(getLastDialedIndex(index, lastDialed));
        //removeLastDialed(index,lastDialed);
        dial(id,lastDialed);
    }

    public static int getLastDialed(int[] lastDialed) {
        return lastDialed[0];
    }

    public static int getLastDialedIndex(int index, int[] lastDialed) {
        if (lastDialed.length >= index)
            return lastDialed[index - 1];
        else {
            System.out.println("Numer z poza zakresu tablicy.");
            return 0;
        }
    }

    public static int dial(int id, int[] lastDialed) {
        //webinar 6
        //lastDialed[0] = id;
        //System.out.println(lastDialed[0]);

      //webinar 7
        int lenght = lastDialed.length;
        for(int i=lenght-1;i>0;i--)
            lastDialed[i]=lastDialed[i-1];
        lastDialed[0]=id;

        for(int i=0; i<lenght;i++)
            System.out.printf(lastDialed[i]+ ", ");

        return 0;
    }

    public static int removeLastDialed(int index, int[] lastDialed) {
        if (lastDialed.length >= index) {
            lastDialed[index - 1] = 0;
            System.out.println(lastDialed[index - 1]);
            return 0;
        } else {
            System.out.println("Numer z poza zakresu tablicy.");
            return 0;
        }
    }
}
