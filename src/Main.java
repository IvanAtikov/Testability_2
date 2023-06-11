public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87;     // Рост указать в метрах
        int weight = 98;          // Вес указать в килограммах
        int index = service.calculate(height, weight);
        System.out.println("Индекс  =   " + index);
    }
}