public class BmiService {
    public int calculate(double height, int weight) {
        int result = (int) (weight / Math.pow(height, 2));
        return result;
    }
}