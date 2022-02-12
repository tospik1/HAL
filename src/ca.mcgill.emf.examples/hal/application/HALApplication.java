package hal.application;

import org.eclipse.emf.ecore.resource.Resource;

import hal.HalFactory;
import hal.HalPackage;
import hal.HomeAutomationSystem;
import hal.SmartHome;
import hal.util.HalResourceFactoryImpl;
import hal.util.ResourceHelper;

public class HALApplication {

	private static HomeAutomationSystem homeAutomationSystem;
	private static String filename = "data/data.tournament";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Initialize HAL package and prepare resource helper
        HalPackage.eINSTANCE.eClass();
        ResourceHelper.INSTANCE.addResourceFactory("homeAutomationSystem", new HalResourceFactoryImpl());
        
        SmartHome smartHome = HalFactory.eINSTANCE.createSmartHome();
        getHomeAutomationSystem().getSmarthome().add(smartHome);
        
		//START THE UI
        
	}

	public static HomeAutomationSystem getHomeAutomationSystem() {
		// make sure that only one instance of HomeAutomationSystem exists
		if (homeAutomationSystem == null) {
			homeAutomationSystem = load();
		}
 		return homeAutomationSystem;
	}
	
	public static void save() {
		ResourceHelper.INSTANCE.saveResource(homeAutomationSystem, filename);
	}
	
	public static HomeAutomationSystem load() {
		HomeAutomationSystem homeAutomationSystem;
		try {
			Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
			homeAutomationSystem = (HomeAutomationSystem) resource.getContents().get(0);
	    } catch (RuntimeException e) {
			// model cannot be loaded - create an empty Home Automation System
	    	homeAutomationSystem = HalFactory.eINSTANCE.createHomeAutomationSystem();
		}
		return homeAutomationSystem;
	}

}
