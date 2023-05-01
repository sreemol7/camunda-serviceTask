package com.example.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ServiceDemo implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        System.out.println("Service Demo Implementation");

        String key = delegateExecution.getBusinessKey();
        String empName= (String) delegateExecution.getVariable("empName");

        System.out.println("Key :"+key);
        System.out.println("Employee Name :"+empName);

        delegateExecution.setVariable("empFullName","Peter England");

    }
}
