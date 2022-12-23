public class ArrayFunctions {

    int[] array;

    ArrayFunctions(int[] array_parameter){
        array = array_parameter;
    }
    public static int[] copyArray(int[] array){
        int pos = 0;
        int[] newArray = new int[array.length];
        for (int i : array){
            newArray[pos++] = i;
        }
        return newArray;
    }
    public int countNumber(int number){
        int cnt = 0;
        for (int i : array){
            if (number == i){
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean inArray(int number, int[] array){
        for (int i : array){
            if (number == i){
                return false;
            }
        }
        return true;
    }
    public int twiceNumbers(){
        int[] arrayDoubles = {};
        for (int i = 0; i < array.length; i++) {
            if (countNumber(array[i]) > 1 && inArray(array[i], arrayDoubles)){
               arrayDoubles = list(arrayDoubles, array[i]);
            }
        }
        return arrayDoubles.length;
    }

    public int[] doubleNumbers(){
        int[] newArray = new int[twiceNumbers()];
        int pos = 0;
        for (int i = 0; i < array.length; i++){
            if (countNumber(array[i]) > 1 && inArray(array[i], newArray)){
                newArray[pos++] = array[i];
            }
        }
        return newArray;
    }

    public int countDoubleNumbers(){
        int cnt = 0;
        for (int i = 0; i < doubleNumbers().length; i++){
            if (countNumber(doubleNumbers()[i]) > 1){
                cnt++;
            }
        }
        return cnt;
    }
    public static int[] list(int[] array, int number){
        int[] arrayNumber = {number};
        ArraysFunctions arrayPlusNumber = new ArraysFunctions(array, arrayNumber);
        return arrayPlusNumber.arrayContcatination();

    }
    public static int[] arrayToSet(int[] array){
        int[] set = {};
        for (int i = 0; i < array.length; i++) {
            if (inArray(array[i], set)){
                set = list(set, array[i]);
            }
        }
        return set;
    }

    public static boolean istArraySortirert(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean istArraySortirertReverse(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]){
                return false;
            }
        }
        return true;
    }
    public static int[] sort(int[] array){
        int[] arraySorted = copyArray(array);
        while ( ! istArraySortirert(arraySorted)){
            for (int i = 1; i < arraySorted.length; i++) {
                if (arraySorted[i - 1] > arraySorted[i]){
                    int temp = arraySorted[i];
                    arraySorted[i] = arraySorted[i - 1];
                    arraySorted[i - 1] = temp;
                }
            }
        }
        return arraySorted;
    }

    public static int[] reveseSort(int[] array){
        int[] arraySorted = copyArray(array);
        while ( ! istArraySortirertReverse(arraySorted)){
            for (int i = 1; i < arraySorted.length; i++) {
                if (arraySorted[i - 1] < arraySorted[i]){
                    int temp = arraySorted[i];
                    arraySorted[i] = arraySorted[i - 1];
                    arraySorted[i - 1] = temp;
                }
            }
        }
        return arraySorted;
    }
}
