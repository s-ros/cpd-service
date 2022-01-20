package com.sross.cpd.service;

import com.sross.cpd.domain.CrimeIncident;
import com.sross.cpd.domain.TrafficStop;

import java.util.Collection;

public interface TrafficStopService {
    Collection<TrafficStop> list(int limit);
}
