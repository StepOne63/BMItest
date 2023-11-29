public class BmiService {
    public double calculate(int weight, double height) {
        weight = 111;
        height = 2.03;
        double index = weight / (height * height);
        return (int) index;

    }


}
