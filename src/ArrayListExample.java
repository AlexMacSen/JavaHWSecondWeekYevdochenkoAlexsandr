import java.util.ArrayList;

/**
 * Created by user on 01.02.2017.
 */
public class ArrayListExample {
    /**
     * Нужно сохранить имена и фамилии всех своих сотрудников в ArrayList.
     * Каждый месяц, работник будет выбран случайным образом из этих записей,
     * чтобы получить премию.
     */
    public static void listWorkers(ArrayList workers) {
        int arraySize, randomWorker;
        // определяем длину массива
        arraySize = workers.size();
        // запускаем цикл равным 12-ти месяцам
        for (int month = 1; month <= 12; month++) {
            randomWorker = (int) (Math.random() * arraySize);
            // выводим результат
            System.out.println("В " + month + "-м месяце премию получил(а): " + workers.get(randomWorker));

        }
    }

    public static void main(String[] args) {

        ArrayList<String> workers = new ArrayList<String>();
        // добавим в список сотрудников
        workers.add("Иванов Иван");
        workers.add("Петров Петр");
        workers.add("Сидоров Сергей");
        workers.add("Антонов Антон");
        workers.add("Громов Борис");
        workers.add("Светличная Оксана");
        workers.add("Черненко Юлия");
        workers.add("Шевченко Тамила");
        workers.add("Тарасова Таня");
        workers.add("Резниченко Наташа");

        listWorkers(workers);
    }


}

