package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if(i > 0 &&  i <= (height - 1) / 2 && (j < i || height - 1 - j < i)) {
                    System.out.print(" ");
                    continue;
                }
                if(i < height - 1 &&  i > (height - 1) / 2 && (j < height - 1 - i || j > i)) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
