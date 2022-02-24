import java.util.Arrays;

public class Array {
    public static void main(String[] args) {



                Integer[]sklad = new Integer[5];
        sklad[0] = 10;
        sklad[1] = 20;
        sklad[2] = 1;
        sklad[3] = 5;
        sklad[4] = 8;
        System.out.println(sklad.length); // вместимость склада 5!

//        for (Integer i = 0; i < 4; i++) {
//            System.out.println(sklad[i]); // просматриваем все элементы склада
        Arrays.sort(sklad, 0, 4); //сортируем весь массив от нулевого до четвёртого члена
        System.out.println(Arrays.toString(sklad));//выводим отсортированный массив в консоль

        int key = Arrays.binarySearch(sklad, 5); // ищем число 5 - key
        System.out.println(key); //распечатываем индекс искомого числа

        sklad[1]=0; // удаляем элемент массива
        System.out.println(Arrays.toString(sklad));  // проверяем результат

        }

        private static void sort (Integer[]sklad){

        }
}