package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public static void printPyramid(int cathetusLength) {

        for (int i = 1; i <=cathetusLength ; i++) {

            for (int j = 1; j <=cathetusLength- i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
//            for (int j = 1; j <=cathetusLength- i ; j++) {
//                System.out.print();
//            }


            System.out.println();
        }


    }

    public static void main(String[] args) {
        printPyramid(9);
        printPyramid(6);
        printPyramid(0);
    }
}
