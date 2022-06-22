public abstract class BodyMassIndex {

    double weight;
    double height;

    public String calculate(double weight, double height){
        this.weight = weight; // weight must be kg
        this.height = height;
        height /= 100;
        height *= height; // height  must be m^2

        if((weight/height) <= 18.5){ return "Underweight BMI = " + weight/height;}
        else if((weight/height) > 18.5 && (weight/height) < 24.9){ return "Normal Weight BMI =" + weight/height;}
        else if((weight/height) > 25.0 && (weight/height) < 29.9){ return "Overweight BMI = " + weight/height;}
        else if((weight/height) > 30.0 && (weight/height) < 34.9){ return "Obese Class I BMI = " + weight/height;}
        else if ((weight/height) > 35.0 && (weight/height) < 39.9){ return "Obese Class II  BMI =" + weight/height;}
        else if((weight/height) > 40.0){ return "Obese Class III BMI = " + weight/height;}
        else{ return "Wrong Data";}
    }


    // References
    // https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/healthy-weights/canadian-guidelines-body-weight-classification-adults/quick-reference-tool-professionals.html


}
