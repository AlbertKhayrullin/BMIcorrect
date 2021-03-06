public class BMI {
    public static void main(String[] args) {
        double height = 169;
        int weight = 90;
        int index = (int) (weight / ((height / 100) * (height / 100)));
        System.out.print("Ваш индекс массы тела составляет ");
        System.out.print(index);
        System.out.println(" кг/м2");
    }
}
