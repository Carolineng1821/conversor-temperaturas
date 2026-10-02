public class ConversorTemperaturas {

    public ResultadoTemperatura conversor (Temperatura temperaturaOrigen) {

        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;
        double valor = temperaturaOrigen.getValor();

        if (temperaturaOrigen.getCodigo().equals("°C")) {
            celsius = valor;
            fahrenheit = (valor * 9 / 5) + 32;
            kelvin = valor + 273.15;
        } else if (temperaturaOrigen.getCodigo().equals("°F")) {
            fahrenheit = valor;
            celsius = (valor - 32) * 5 / 9;
            kelvin = (valor - 32) * 5 / 9 + 273.15;
        } else if (temperaturaOrigen.getCodigo().equals("K")) {
            kelvin = valor;
            celsius = valor - 273.15;
            fahrenheit = (valor - 273.15) * 9 / 5 + 32;
        }
        return new ResultadoTemperatura(celsius, fahrenheit, kelvin);
    }
}
