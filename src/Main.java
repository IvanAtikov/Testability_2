public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double rost = 1.87;     // Рост указать в метрах
        int ves = 98;          // Вес указать в килограммах
        int index = service.calculate(rost, ves);
        System.out.println("Индекс  =   " + index);
    }
}