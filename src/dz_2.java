public class dz_2 {
    //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
    // новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
    // Если длины  массивов не равны, необходимо как-то оповестить пользователя

    public static void main(String[] args){
        int[] arr1 = new int[] {2,5,78,23,6,0};
        int[] arr2 = new int[] {8,0,-46,1,6,0};
        int[] result = sumArray(arr1, arr2);
        for (int num: result) {
            System.out.printf(num + "\t");
        }
    }

    public static int[] sumArray(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new RuntimeException("длины  массивов не равны");
        }
        int[] resArr = new int[arr1.length];
        for (int i = 0; i < resArr.length; i++) {
            resArr[i] = arr1[i] + arr2[i];
        }
        return resArr;
    }
}
