package litery_alfabetu_do_while;

public class Litery {

    public static void main(String[] args)
    {
        char znak;

        System.out.println();
        System.out.println("Program wypisuje duze litery A-Z i Z-A.\n");

        znak = 'A';
        do
        {
            if(znak < 'Z')
                System.out.print(znak + ",");
            else
                System.out.print(znak + ".\n");
            znak++;
        }
        while(znak <= 'Z');

        znak = 'Z';
        do
        {
            if (znak > 'A')
                System.out.print(znak + ",");
            else
                System.out.print(znak + ".");
            znak--;
        }
        while(znak >= 'A');

    }
}
