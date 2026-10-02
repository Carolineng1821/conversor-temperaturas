public class ResultadoTemperatura {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public ResultadoTemperatura(double celsius, double fahrenheit, double kelvin) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }
    public double getCelsius() {
        return celsius;
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    public double getKelvin() {
        return kelvin;
    }
}
