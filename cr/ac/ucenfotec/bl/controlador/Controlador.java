package cr.ac.ucenfotec.bl.controlador;

import cr.ac.ucenfotec.bl.iu.IU;

public class Controlador {

    private final IU iu = new IU();

    public void ejecutar() {

        boolean ward = true;
        while (ward) {
            switch (IU.showMainMenu()) {
                case 1:
                    estadias();
                    break;
                case 2:
                    citas();
                    break;
                case 3:
                    IU.print("Hasta Pronto!");
                    System.exit(0);
                    break;
                default:
                    IU.print("Esa no es una opcion valida!");
                    break;
            }
        }
    }

    private void estadias() {
        boolean ward = true;
        while (ward) {
            switch (IU.showMenuEstadias()) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    ward = false;
                    break;
                case 5:
                    System.out.println("Hasta Pronto!");
                    System.exit(0);
                    break;
                default:
                    IU.print("Esa no es una opcion valida!");
                    break;
            }
        }
    }

    private void citas() {
        boolean ward = true;

    }

}
