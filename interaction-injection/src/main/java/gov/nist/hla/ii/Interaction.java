package gov.nist.hla.ii;

import org.portico.impl.hla1516e.types.HLA1516eParameterHandleValueMap;

import hla.rti1516e.InteractionClassHandle;
import hla.rti1516e.ParameterHandle;
import hla.rti1516e.ParameterHandleValueMap;

public class Interaction {
//	private class Parameter {
//		private InteractionClassHandle handle;
//		private String value;
//
//		public Parameter(InteractionClassHandle handle, String value) {
//			this.handle = handle;
//			this.value = value;
//		}
//
//		public InteractionClassHandle getHandle() {
//			return handle;
//		}
//
//		public String getValue() {
//			return value;
//		}
//	}

	private InteractionClassHandle interactionClass;
	private ParameterHandleValueMap parameters;

	public Interaction(InteractionClassHandle interactionClass, ParameterHandleValueMap theInteraction) {
		this.interactionClass = interactionClass;
		this.parameters = theInteraction;
	}

	public InteractionClassHandle getInteractionClassHandle() {
		return interactionClass;
	}

	public int getParameterCount() {
		return parameters.size();
	}

	public byte[] getParameterHandle(ParameterHandle index) {
		return parameters.get(index);
	}

	public String getParameterValue(ParameterHandle index) {
		return decodeString(parameters.get(index));
	}

	public ParameterHandleValueMap getParameters() {
		return parameters;
	}

	public void setParameters(HLA1516eParameterHandleValueMap parameters) {
		this.parameters = parameters;
	}

	private String decodeString(byte[] buffer) {
		// InteractionRoot.cpp does not send a c-string so we do not need to check for
		// \0
		// see InteractionRoot::createDatamemberHandleValuePairSet and
		// InteractionRoot::setParameters
		return new String(buffer);
	}
}
