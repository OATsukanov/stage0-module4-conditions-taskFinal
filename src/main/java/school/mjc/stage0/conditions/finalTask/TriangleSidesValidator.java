package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {

        int intFirstSide = (int) firstSide;
        int intSecondSide = (int) secondSide;
        int intThirdSide = (int) thirdSide;


        if (intFirstSide <= 0 || intSecondSide <= 0 || intThirdSide <= 0) {
            System.out.println("it's not a triangle");
        } else {
            String i = (intFirstSide > intSecondSide - intThirdSide) &&
                    (intSecondSide > intFirstSide - intThirdSide) &&
                    (intThirdSide > intFirstSide - intSecondSide) ? "this is a valid triangle" : "it's not a triangle";
            System.out.println(i);
        }
    }
}
