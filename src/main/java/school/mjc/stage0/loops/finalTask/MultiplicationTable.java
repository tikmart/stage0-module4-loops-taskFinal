package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public static void printTable(int numberTableToPrint){

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numberTableToPrint + " x " + i + " = " + numberTableToPrint * i);
        }
    }

    public static void main(String[] args) {
        printTable(2);
        printTable(0);
        printTable(5);
    }
}
