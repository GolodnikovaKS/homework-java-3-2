public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        double kilogram = 98;
        double meter = 1.87;
        int bmi = service.calculate(kilogram, meter);
        System.out.println("bmi-индекс из условия задачи = " + bmi);
        System.out.println();
        System.out.println("bmi-индекс (62 кг / 1.75 м) = " + service.calculate(62, 1.75));
        System.out.println();
        System.out.println("bmi-индекс (85 кг / 1.85 м) = " + service.calculate(85, 1.85));
    }
}