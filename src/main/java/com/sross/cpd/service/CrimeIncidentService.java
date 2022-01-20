package com.sross.cpd.service;

import com.sross.cpd.domain.CrimeIncident;

import java.util.Collection;

public interface CrimeIncidentService {
    Collection<CrimeIncident> list(int limit);


}
