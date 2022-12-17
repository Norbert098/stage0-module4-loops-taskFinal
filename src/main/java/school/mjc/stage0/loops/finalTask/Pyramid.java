package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" "); //first rectangle with spaces
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j); //second "mirror" rectangle with numbers
            }
            for (int j = 2; j <= i; j++) { //third "mirror" rectangle of the second
                System.out.print(j);
            }
            System.out.println(); //new line
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
