public class CostePersonal {

    static float CosteDelPersonal(Trabajador[] trabajadores) {
        float costeFinal = 0;

        for (Trabajador trabajador : trabajadores) {
            float nomina = trabajador.getNomina();

            if (trabajador.esDirector() || trabajador.esSubdirector()) {
                costeFinal += nomina;
            } else {
                costeFinal += nomina + (trabajador.getHorasExtras() * 20);
            }
        }

        return costeFinal;
    }
}
