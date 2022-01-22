package com.sross.cpd.service;

import com.sross.cpd.domain.CrimeIncident;
import com.sross.cpd.request.CrimeIncidentRequest;

import java.util.Collection;
import java.util.List;

public interface CrimeIncidentService {
    Collection<CrimeIncident> list(int limit);
    List<CrimeIncident> getCrimeIncidentsBy(CrimeIncidentRequest crimeIncidentRequest);


}
