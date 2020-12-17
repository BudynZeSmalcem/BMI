package BMITest.exercise;

public class BMI {
    // Napisz program, który obliczy wskaźnik BMI wg wzoru waga/wzrost2
    // BMI < 18,5 - "get some weight"
    // BMI = 25 and higher - "you need to grow"
    // else - "good weight"
    // weight or growth < 0? - "I don't think so"

    public String checkBmi(int weight, double growth) {
        if (weight < 0 || growth < 0) {
            return "I don't think so";
        }
        if (weight == 0 || growth == 0)
            return "do not divide by 0";

        double BMI = weight / Math.pow(growth, 2);
        if (BMI < 18.5) {
            return "get some weight";
        } else if (BMI >= 25) {
            return "you need to grow";
        } else {
            return "good weight";
        }
    }
}
