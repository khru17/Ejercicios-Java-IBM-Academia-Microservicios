import com.ibm.academia.caja.*;

public class CajaPrueba {

    public static void main(String[] args) {
        Caja caja = new Caja();
        caja.setAncho(3);
        caja.setAlto(2);
        caja.setProfundo(6);
        caja.calcularVolumen();
    }
}
