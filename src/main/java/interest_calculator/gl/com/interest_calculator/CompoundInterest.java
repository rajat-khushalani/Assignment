
package interest_calculator.gl.com.interest_calculator;
public class CompoundInterest extends SimpleInterest {

    public double calculateCompoundInterest(float principle,float rate,float year){
        super.principle=principle;
        super.rate=rate;
        super.year=year;
        double amount = principle * (Math.pow((1 + rate / 100), year));
        double ci=amount-principle;
        return ci;
    }
}
