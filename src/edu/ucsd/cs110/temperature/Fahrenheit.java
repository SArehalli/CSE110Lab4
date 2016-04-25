package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return null;
        //return new Celsius((getValue()-32) * (5/9));
    }

    @Override
    public Temperature toFahrenheit() {
        return null;
        //return new Fahrenheit(getValue());
    }


    public String toString()
    {
        // TODO: Complete this method
        return "";
    }
}

