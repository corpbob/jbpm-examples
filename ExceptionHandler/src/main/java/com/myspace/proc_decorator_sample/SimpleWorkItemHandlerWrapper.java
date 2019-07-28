package com.myspace.proc_decorator_sample;

import java.util.HashMap;
import java.util.Map;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.jbpm.bpmn2.handler.*;
import org.jbpm.bpmn2.handler.AbstractExceptionHandlingTaskHandler;


public class SimpleWorkItemHandlerWrapper
		extends
			AbstractExceptionHandlingTaskHandler {

	public SimpleWorkItemHandlerWrapper() {
		super(org.jbpm.process.workitem.rest.RESTWorkItemHandler.class);
	}
	
	


	@Override
	public void handleExecuteException(Throwable cause, WorkItem workItem,
			WorkItemManager manager) {

		throw new WorkItemHandlerRuntimeException(cause);
	}

	@Override
	public void handleAbortException(Throwable cause, WorkItem workItem,
			WorkItemManager manager) {
	}


}