import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatalogoTemperaturas catalogoTemperaturas = new CatalogoTemperaturas();
        ConversorTemperaturas conversorTemperaturas = new ConversorTemperaturas();
        Temperatura temperaturaOrigen = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona la temperatura que desea calcular: ");
        System.out.println("1. Celsius");
        System.out.println("2. fahrenheit");
        System.out.println("3. Kelvin");

        int opcionOrigen = scanner.nextInt();
        if (opcionOrigen == 1) {
            temperaturaOrigen = catalogoTemperaturas.buscarTemperatura("°C");
        } else if (opcionOrigen == 2) {
            temperaturaOrigen = catalogoTemperaturas.buscarTemperatura("°F");
        } else if (opcionOrigen == 3) {
            temperaturaOrigen = catalogoTemperaturas.buscarTemperatura("K");
        } else {
            System.out.println("Invalido");
            return;
        }

        System.out.println("Cantidad:");
        double cantidad = scanner.nextDouble();
        temperaturaOrigen.setValor(cantidad);

        ResultadoTemperatura resultado = conversorTemperaturas.conversor(temperaturaOrigen);

        System.out.println("Celsius: " + resultado.getCelsius());
        System.out.println("Fahrenheit: " + resultado.getFahrenheit());
        System.out.println("Kelvin: " + resultado.getKelvin());

    }
}