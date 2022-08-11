package cuentaBancaria;

public class Cuenta {

    private String titular;
    private double dineroEnCuenta;
    private double dineroOperacion;
    private String numCuenta;

    public Cuenta(String titular, String numCuenta) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.dineroEnCuenta = dineroEnCuenta;
        this.dineroOperacion = dineroOperacion;
    }

    public Cuenta(String titular, double dineroEnCuenta, String numCuenta) {
        this.titular = titular;
        this.dineroEnCuenta = dineroEnCuenta;
        this.numCuenta = numCuenta;
        this.dineroOperacion = dineroOperacion;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getDineroEnCuenta() {
        return dineroEnCuenta;
    }

    public void setDineroEnCuenta(double dineroEnCuenta) {
        this.dineroEnCuenta = dineroEnCuenta;
    }

    public double getDineroOperacion() {
        return dineroOperacion;
    }

    public void setDineroOperacion(double dineroOperacion) {
        this.dineroOperacion = dineroOperacion;
    }

//    public double ingresar (double cantidad) {
//
//    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", dineroEnCuenta=" + dineroEnCuenta +
                ", dineroOperacion=" + dineroOperacion +
                ", numCuenta='" + numCuenta + '\'' +
                '}';
    }
}
