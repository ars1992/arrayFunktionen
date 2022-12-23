import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 7, -1, 6};
        int[] arrayB = {5, 7, 4, 3, 9, 2};
        int[] arrayC = {5, 5, 5, 4};


        // del Funktion
        System.out.println(Arrays.toString(arrayA));
        //System.out.println(Arrays.toString(PythonArrayFunk.del(arrayA, 2, arrayA.length)));

        // len Funktion
        //System.out.println(PythonArrayFunk.len(arrayA));

        //append Funktion
        PythonArrayFunk arrayFunk = new PythonArrayFunk(arrayA);
        //System.out.println(arrayFunk);
        System.out.println(Arrays.toString(PythonArrayFunk.append(arrayA, 56)));

        //clear Funktion
        //PythonArrayFunk.clear();
        PythonArrayFunk.printArray();

        // count Funktion
        System.out.println(PythonArrayFunk.count(arrayC, 5));

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

        // index Funktion
        System.out.println(PythonArrayFunk.index(arrayA, 3));

        // insert Funktion
        System.out.println(Arrays.toString(PythonArrayFunk.insert(arrayC, 3, 567)));

        // map Funktion
        System.out.println(Arrays.toString(PythonArrayFunk.map(arrayA, new PythonArrayFunk.Map() {
            @Override
            public int map(int number) {
                return number * 3;
            }
        })));

        // remove Funktion
        System.out.println(Arrays.toString(PythonArrayFunk.remove(arrayC, 5, false)));

        // reverse Funktion
        System.out.println(Arrays.toString(PythonArrayFunk.reverse(arrayB)));

        // sort Funktion
        System.out.println(Arrays.toString(PythonArrayFunk.sort(arrayB)));

        // sum Funktion
        System.out.println(PythonArrayFunk.sum(arrayA));
    }


}