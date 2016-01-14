package org.bahmni.module.bahmnicore.service;

public interface DoseCalculatorService {

    Double getCalculatedDoseForRule(String patientUuid, Double baseDose, String doseUnits) throws Exception;
}