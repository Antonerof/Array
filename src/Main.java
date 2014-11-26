import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayCollectionOfInt a = new ArrayCollectionOfInt();
        a.addToArray(1);
        a.addToArray(2);
        a.addToArray(22);
        a.addToArray(34);
        a.addToArray(782);
        System.out.println(Arrays.toString(a.arr));
        a.delFromArray(1);
        System.out.println(Arrays.toString(a.arr));
        a.delFromArray(1);
        System.out.println(Arrays.toString(a.arr));
        System.out.println(a.isExist(1));
    }

    public static class ArrayCollectionOfInt{
        private int[] arr = new int[0];

        public void addToArray(int a){ //Добавляет к массиву значение "а"
            int[] arrNew = new int[arr.length + 1];
            if (arr.length != 0) {
                for (int i = 0; i < arr.length; i++) {
                    arrNew[i] = arr[i];
                }
            }
            arrNew[arrNew.length - 1] = a;
            System.out.println(arrNew[arrNew.length - 1]);
            arr = new int[arrNew.length];
            for (int i = 0; i < arr.length; i++){
                arr[i] = arrNew[i];
            }
        }

        public void delFromArray(int a){ //Удаляет из массива элемент с индексом "а"
            int[] arrNew = new int[arr.length];
            for (int i = 0; i < arr.length - 1; i++){
                if (i >= a) arrNew[i] = arr[i + 1];
                else arrNew[i] = arr[i];
            }
            arr = new int[arrNew.length - 1];
            for (int i = 0; i < arr.length; i++){
                arr[i] = arrNew[i];
            }

        }

        public boolean isExist(int a){ //Проверяет существует ли в массиве элемент с значением "а"
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == a) return true;
            }
            return false;
        }
    }
}
