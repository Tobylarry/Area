public class Area {
    public static void main(String[] args) {
        area(5);
        area(10, 5);
    }
    public static double area(double radius) {
        if (radius < 0){
            return -1.0;
        }else{
            double result = radius * radius * Math.PI;
            System.out.println(result);
            return result;
        }
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }else {
            double result2 =  x * y;
            System.out.println(result2);
            return result2;
        }

    }
}
