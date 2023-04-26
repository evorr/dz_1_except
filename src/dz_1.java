import java.util.ArrayList;

public class dz_1 {
    // Реализуйте метод checkArray(Integer[] arr), принимающией в качестве аргумента целочисленный
    // одномерный массив. Метод должен пройтись по каждому элементу и проверить что он не равен null.
    // А теперь реализуйте следующую логику:
    // Если в какой-то ячейке встретился null, то необходимо "оповестить" об этом пользователя
    // Если null'ы встретились в нескольких ячейках, то идеально было бы все их "подсветить"
    public static void main(String[] args){
        Integer[] arr = {null,5,8,8,3};
        checkArray(arr);

    }

    public static void checkArray(Integer[] arr){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == null){
                indexes.add(i);
            }
        }
        if(indexes.size() == 1){
            throw new RuntimeException("по индексу " + indexes.get(0) + " значение null");
        } else if(indexes.size() > 1){
            System.out.println("Ячейки со значением null: " + String.join(", ", indexes.toString()));
        }

    }
}
