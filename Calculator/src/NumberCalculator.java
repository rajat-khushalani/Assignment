class NumberCalculator extends GenericNumberCalculator <Number>
{
    public Number add(Number num1, Number num2)
    {
        return (num1.doubleValue() + num2.doubleValue());
    }
    public Number subtract(Number num1, Number num2)
    {
        return (num1.doubleValue() - num2.doubleValue());
    }
    public Number multiply(Number num1, Number num2)
    {
        return (num1.doubleValue() * num2.doubleValue());
    }
    public Number divide(Number num1, Number num2)
    {

        return (num1.doubleValue()/num2.doubleValue());
    }
}

