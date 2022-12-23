public class ArraysFunctions {
    public static int[] arrayA = new int[0];
    public static int[] arrayB = new int[0];

    ArraysFunctions(int[] arrayA_Parameter, int[] arrayB_Parameter){
        arrayA = arrayA_Parameter;
        arrayB = arrayB_Parameter;
    }

    public static int[] arrayContcatination(){
        int[] newArray = new int[arrayA.length + arrayB.length];
        int placeNewArray = 0;
        for (int j : arrayA) {
            newArray[placeNewArray++] = j;
        }
        for (int i : arrayB) {
            newArray[placeNewArray++] = i;
        }
        return newArray;
    }

}
