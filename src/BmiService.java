public class BmiService {
    public int calculate(double rost, int ves) {
        int result = (int) (ves / Math.pow(rost, 2));
        return result;
    }
}