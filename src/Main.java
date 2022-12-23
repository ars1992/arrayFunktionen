import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 7, -1, 6};
        int[] arrayB = {5, 3, 3, 7};


        // del Funktion
        System.out.println(Arrays.toString(arrayA));
        //System.out.println(Arrays.toString(PythonArrayFunk.del(arrayA, 2, arrayA.length)));

        // len Funktion
        //System.out.println(PythonArrayFunk.len(arrayA));

        //append Funktion
        PythonArrayFunk arrayFunk = new PythonArrayFunk(arrayA);
        //System.out.println(arrayFunk);
        System.out.println(Arrays.toString(PythonArrayFunk.append(56, arrayA)));

        //clear Funktion
        //PythonArrayFunk.clear();
        PythonArrayFunk.printArray();

        // count Funktion
        System.out.println(PythonArrayFunk.count(1));

        // extend Funktion
        //System.out.println(Arrays.toString(PythonArrayFunk.extend(arrayA, arrayB)));

        // iterator Funktion.
        System.out.println(Arrays.toString(PythonArrayFunk.filter(arrayA, new PythonArrayFunk.Filter() {
            @Override
            public boolean filter(int number) {
                // Was soll überprüft werden.
                return number % 3 == 0;
            }
        })));

        // min Funktion
        System.out.println(PythonArrayFunk.min(arrayA));

        // max Funktion
        System.out.println(PythonArrayFunk.max(arrayA));

        // pop Funktion
        System.out.println(Arrays.toString(PythonArrayFunk.pop(arrayA, 0)));
    }


}