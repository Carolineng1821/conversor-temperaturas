public class Temperatura {
    String nombre;
    String codigo;
    double valor;

    public Temperatura(String nombre, String codigo, double valor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.valor = valor;
    }
    public String getNombre() { return nombre; }
    public String getCodigo() { return this.codigo; }
    public double getValor() { return this.valor; }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  nombre + " " + codigo + " " + valor;
    }
}
