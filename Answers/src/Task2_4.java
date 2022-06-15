// С помощью функции копирования и операции конкатенации 
// составить из частей слова “информатика” слово “торт”

public class Task2_4 {

    public static void main(String[] args) {

        String informatika = "информатика";
        String tort = informatika.substring(7, 8) + informatika.substring(3, 5) + informatika.substring(7, 8);

        System.out.println(tort);
    }
}