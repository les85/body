public class BmiService {
    public int calculate(int weightKg, int heightM){
        // Рассчитываем BMI
        int bmi = weightKg / (heightM * heightM);
        return (int) bmi; // Приводим результат к целому числу

    }
}
