import java.util.ArrayList;
import java.util.List;

public class CatalogoTemperaturas {
    private List<Temperatura> temperaturaList = new ArrayList<>();
    public CatalogoTemperaturas() {
        temperaturaList.add(new Temperatura("Celsius ", "°C", 0));
        temperaturaList.add(new Temperatura("Fahrenheit ", "°F", 0));
        temperaturaList.add(new Temperatura("Kelvin ", "K", 0));
    }

    public Temperatura buscarTemperatura(String codigo) {
        for (Temperatura temperaturaActual : temperaturaList) {
            if (temperaturaActual.getCodigo().equals(codigo)) {
                return temperaturaActual;
            }
        }
        return null;
    }
}
