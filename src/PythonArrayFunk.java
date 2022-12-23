public class PythonArrayFunk {
    static int[] classArray;
    PythonArrayFunk(int[] array){
        classArray = array;
    }

    public static void printArray(){
        System.out.print("[ ");
        for (int i : classArray){
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    /**
     * PythonArrayFunk.del(arrayA, 2, arrayA.length)
     * Funktion erstellt neues Array mit den Werten ohne
     * den start ende bereich
     * @param array
     * @param start
     * @param ende
     * @return neues Array
     */
    public static int[] del(int[] array, int start, int ende){
        int[] newArray = new int[array.length - (ende - start)];
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < start || i >= ende){
                newArray[pos] = array[i];
                pos++;
            }
        }
        return newArray;
    }

    /**
     * PythonArrayFunk.len(arrayA)
     * Giebt die Array länge zurück
     * @param array
     * @return int Arraylänge
     */
    public static int len(int[] array){
        return array.length;
    }

    /**
     * PythonArrayFunk.append(56)
     * Fügt number am ende dieses Arrays hinzu.
     * Gibt neues Array zurück
     * @param number
     * @return neues Array
     */
    public static int[] append( int[] array, int number){
        int[] newArray = new int[array.length + 1];
        int pos = 0;
        for (int i : array){
            newArray[pos++] = i;
        }
        newArray[pos] = number;
        return newArray;
    }

    /**
     * PythonArrayFunk.clear();
     *  Löscht die Array (entspricht a={0}).
     */
    public static void clear(){
        classArray = new int[1];
    }

    /**
     * "PythonArrayFunk.count(number)"
     * Ermittelt, wie oft das Element number in der Liste
     * vorkommt.
     * @param number
     * @return
     */
    public static int count(int[] array, int number){
        int cnt = 0;
        for (int i : array){
            if (i == number) cnt++;
        }
        return cnt;
    }

    /**
     * Fügt die Array arrayB am Ende von arrayA hinzu
     * @param arrayA
     * @param arrayB
     * @return neues Array
     */
    public static int[] extend(int[] arrayA, int[] arrayB){
        int[] newArray = new int[arrayA.length + arrayB.length];
        int pos = 0;
        for (int i : arrayA){
            newArray[pos++] = i;
        }
        for (int j : arrayB){
            newArray[pos++] = j;
        }
        return newArray;
    }

    /**
     * Filter Funktion
     */
    public interface Filter{
        public boolean filter(int number);
    }

    /**
     * Wendet die Funktion filter auf alle Elemente an.
     * @param array
     * @param funktion
     * @return
     */
    public static int[] filter(int[] array, Filter funktion){
        int cnt = 0;
        for (int i : array){
            if (funktion.filter(i)){
                cnt++;
            }
        }
        int[] newArray = new int[cnt];
        int pos = 0;
        for (int i : array){
            if (funktion.filter(i)){
                newArray[pos++] = i;
            }
        }
        return newArray;
    }

    /**
     * Ermittelt das kleinste Element
     * @param array
     * @return
     */
    public static int min(int[] array){
        int min = array[0];
        for (int i : array)
            if (i < min)
                min = i;
        return min;
    }

    /**
     * Ermittelt das größte Element
     * @param array
     * @return
     */
    public static int max(int[] array){
        int max = array[0];
        for (int i : array)
            if (i > max)
                max = i;
        return max;
    }

    /**
     * Liest das Element an der Position pos und
     * entfernt es.
     * @syntax PythonArrayFunk.pop(arrayA, 0)
     * @param array
     * @param pos
     * @return
     */
    public static int[] pop(int[] array, int pos){
        int[] newArray = new int[array.length - 1];
        int c = 0;
        for (int i = 0; i < array.length; i++){
            if (i != pos){
                newArray[c++] = array[i];
            }
        }
        return newArray;
    }

    /**
     * PythonArrayFunk.index(arrayA, 3)
     * Index Funktion.
     * Ermittelt die erste Position von element in der
     * Liste.
     * @author Salomon Alessandro
     * @param array
     * @param element
     * @return Position oder -1 wenn element nicht vorhanden ist
     */
    public static int index(int[] array, int element){
        int cnt = 0;
        for (int i : array) {
            if (element == i)
                return cnt;
            cnt++;
        }
        return -1;
    }

    /**
     * PythonArrayFunk.insert(arrayB, 2, 567)
     * Fügt das Element element an der Position pos in die
     * Liste ein. Bei Überschreiten der Array länge wird der
     * Platz mit dem Wert 0 aufgefüllt
     * @param array
     * @param pos
     * @param element
     * @return
     */
    public static int[] insert(int[] array, int pos, int element){
        int[] newArray;
        int arrayLength = 0;
        if (pos > array.length){
            arrayLength = pos - array.length;
            newArray = new int[array.length + arrayLength + 1];
        } else {
            newArray = new int[array.length + 1];
        }
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == pos)
                newArray[c++] = element;
            newArray[c++] = array[i];
        }
        if (arrayLength > 0){
            for (int i = array.length; i < newArray.length; i++) {
                if (i == pos)
                    newArray[c] = element;
                c++;
            }
        }
        return newArray;
    }

    /**
     * map Funktion
     */
    public interface Map{
        int map(int number);
    }

    /**
     * Wendet die Funktion new PythonArrayFunk.Map() auf  alle Elemente an.
     * @param array
     * @param funktion
     * @return
     */
    public static int[] map(int[] array, Map funktion){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            newArray[i] = funktion.map(array[i]);
        }
        return newArray;
    }

    /**
     * Entfernt das Element number aus dem Array.
     * Mit true werden alle entfernt.
     * Mit false das erste Element welches gleich number ist.
     * @param array
     * @param number
     * @param all
     * @return neues Array ohne die number
     */
    public static int[] remove(int[] array, int number, boolean all){
        int [] newArray;
        int pos = 0;
        if (all){
            newArray = new int[array.length - count(array, number)];
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number)
                    continue;
                newArray[pos++] = array[i];
            }
        } else {
            boolean found = false;
            newArray = new int[array.length - 1];
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number && !found) {
                    found = true;
                    continue;
                }
                newArray[pos++] = array[i];
            }
        }
        return newArray;
    }

    /**
     * Dreht das Array um(das erste Element
     * zuletzt etc.).
     * @param array
     * @return Array in Umgekehrter Reihenfolge
     */
    public static int[] reverse(int[] array){
        int[] newArray = new int[array.length];
        int pos = 0;
        for (int i = array.length - 1; i >= 0; i--){
            newArray[pos++] = array[i];
        }
        return newArray;
    }

    /**
     * Erstellt eine Copy vom Array
     * @param array
     * @return
     */
    public static int[] copy(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    private static boolean isSort(int[] array){
        for (int i = 1; i < array.length; i++){
            if (array[i - 1] > array[i])
                return false;
        }
        return true;
    }

    /**
     * Sortiert die Liste.
     * @param array
     * @return gibt ein neues sortiertes Array zurück
     */
    public static int[] sort(int[] array){
        int[] newArray = copy(array);
        while ( ! isSort(newArray)){
            for (int i = 1; i < newArray.length; i++){
                if (newArray[i - 1] > newArray[i]){
                    int temp = newArray[i - 1];
                    newArray[i - 1] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Berechnet die Summe der Listenelemente.
     * @param array int[]
     * @return summe des Arrays
     */
    public static int sum(int[] array){
        int sum = 0;
        for ( int i : array){
            sum += i;
        }
        return sum;
    }

    /**
     * Verbindet die Array elemente paarweise zu
     * einem verschachteltem Array.
     * @param arrayA int[]
     * @param arrayB int[]
     * @return int[][]
     */
    public static int[][] zip(int[] arrayA, int[] arrayB){
        int[][] newArray;
        if (arrayA.length >= arrayB.length){
            newArray = new int[arrayB.length][2];
        } else {
            newArray = new int[arrayA.length][2];
        }
        for (int i = 0; i < newArray.length; i++) {
            newArray[i][0] = arrayA[i];
            newArray[i][1] = arrayB[i];
        }
        return newArray;
    }
}

