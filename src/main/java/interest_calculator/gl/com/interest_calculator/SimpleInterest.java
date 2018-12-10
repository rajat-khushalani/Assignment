package interest_calculator.gl.com.interest_calculator;
public class SimpleInterest {
float principle;
float rate;
float year;
    public float calculateSimpleInterest(float principle,float rate,float year){
        this.principle=principle;
        this.rate=rate;
        this.year=year;
        float si = (principle * principle * year) / 100;
        return si;
    }

}
