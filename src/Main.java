public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 111;
        double height = 2.03;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}