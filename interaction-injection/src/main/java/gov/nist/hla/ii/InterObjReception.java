package gov.nist.hla.ii;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface InterObjReception {

	EObject receiveInteraction(Double timeStep, EObject interaction);
	
	EObject receiveObject(Double timeStep, String objectClassName, String objectName,
			Map<String, byte[]> attributes);
}
