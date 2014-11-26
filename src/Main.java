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
        System.out.println(a.ifExist(1));
        a.addToArray(782);
        System.out.println(Arrays.toString(a.arr));
        a.delFromArray(34);
        System.out.println(Arrays.toString(a.arr));
    }

    public static class ArrayCollectionOfInt{ //Множество
        private int[] arr = new int[0]; //Массив для записи множества

        public void addToArray(int a){ //Добавляет к массиву значение "а" если его еще нет в массиве
            if (!ifExist(a)) {
                int[] arrNew = new int[arr.length + 1];
                if (arr.length != 0) {
                    for (int i = 0; i < arr.length; i++) {
                        arrNew[i] = arr[i];
                    }
                }
                arrNew[arrNew.length - 1] = a;
                arr = new int[arrNew.length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arrNew[i];
                }
            }
        }

        public void delFromArray(int b){ //Удаляет из массива элемент "b"
            int a = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == b) {
                    a = i;
                    break;
                }
            }
            if (ifExist(b)) {
                int[] arrNew = new int[arr.length];
                for (int i = 0; i < arr.length - 1; i++) {
                    if (i >= a) arrNew[i] = arr[i + 1];
                    else arrNew[i] = arr[i];
                }
                arr = new int[arrNew.length - 1];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arrNew[i];
                }
            }
        }

        public boolean ifExist(int a){ //Проверяет существует ли в массиве элемент с значением "а"
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == a) return true;
            }
            return false;
        }
    }
}
