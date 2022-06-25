public class BodyMassIndexImpl extends BodyMassIndex {

    @Override
    public void calculate(double weight, double height) {
        this.weight = weight; // weight must be kg
        this.height = height;
        height /= 100;
        height *= height; // height  must be m^2

        if((weight/height) <= 18.5){
            System.out.println( "Underweight BMI = " + weight/height);}
        else if((weight/height) > 18.5 && (weight/height) < 24.9){
            System.out.println( "Normal Weight BMI =" + weight/height);}
        else if((weight/height) > 25.0 && (weight/height) < 29.9){
            System.out.println( "Overweight BMI = " + weight/height);}
        else if((weight/height) > 30.0 && (weight/height) < 34.9){
            System.out.println( "Obese Class I BMI = " + weight/height);}
        else if ((weight/height) > 35.0 && (weight/height) < 39.9){
            System.out.println( "Obese Class II  BMI =" + weight/height);}
        else if((weight/height) > 40.0){
            System.out.println( "Obese Class III BMI = " + weight/height);}
        else{
            System.out.println( "Wrong Data");}
    }
}
