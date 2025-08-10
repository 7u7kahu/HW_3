public class HW_3 {
    public static void main(String[] args) {
        double[] numbers = {8.5, 4.2, -2.3, -4.7, 2.5, 3.1, 6.8, -7.4, 1.2, -3.3, 5.5, -1.1, 4.9, -6.6, 2.0};
        boolean firstNegative = false;

        double sum = 0;
        int count =0;

        for (double num : numbers){
            if (!firstNegative){
                if (num < 0){
                    firstNegative = true;
                }
            }
            else {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

        }
        if (count > 0) {//Чтобы в случае если sum был равен нулю то тогда не выдовало ошибку
            double average = sum / count;
            System.out.println("Cреднее арифметическое = " + average);
        }




    }
}
