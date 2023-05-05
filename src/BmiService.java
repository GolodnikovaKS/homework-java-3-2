public class BmiService {
    public int calculate (double kilogram, double meter) {
        double bmi = kilogram/(meter*meter);
        int result = (int) bmi;
        return result;
    }
}
