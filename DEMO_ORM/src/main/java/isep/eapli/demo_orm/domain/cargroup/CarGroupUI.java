package isep.eapli.demo_orm.domain.cargroup;

import isep.eapli.demo_orm.util.Console;

/**
 *
 * @author mcn
 */
public class CarGroupUI {

    private final CarGroupController controller = new CarGroupController();
    
    public void registerCG() {
        System.out.println("*** Registo Grupo Automóvel ***\n");
        String nome = Console.readLine("Nome:");
        int portas = Console.readInteger("Número de portas");
        String classe = Console.readLine("Classe:");
        CarGroup carGroup = controller.
                registerCarGroup(nome, portas, classe);
        System.out.println("Grupo Automóvel" + carGroup);
    }
    public void listGAs() {
		throw new UnsupportedOperationException("Ainda não implementada.");
	}

	public void searchGAPorID(long id) {
		throw new UnsupportedOperationException("Ainda não implementada.");
	}
}
