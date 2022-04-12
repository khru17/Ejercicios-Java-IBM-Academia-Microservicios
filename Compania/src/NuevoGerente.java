import com.ibm.academia.compania.*;

public class NuevoGerente {

    public static void main(String[] args) {
        Gerente juan = new Gerente("Juan", "Estrada", "25262321", "Calle Zapata #1", 450.25, 2.29);

        juan.toString();

        System.out.println();

        Gerente daniel = new Gerente("Daniel", "Estrada", "51525359", "Calle Pino #52", 352.52, 8.05);
        daniel.toString();

        System.out.println();

        Gerente kawhi = new Gerente("Kawhi", "Leonard", "10080523", "Calle Roble #15", 800.78, 9.52);
        kawhi.toString();

    }
}
