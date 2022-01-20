package com.sross.cpd.service.implementation;

import com.sross.cpd.domain.CrimeIncident;
import com.sross.cpd.repo.CrimeIncidentRepo;
import com.sross.cpd.service.CrimeIncidentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class CrimeIncidentImpl implements CrimeIncidentService {
    private final CrimeIncidentRepo crimeIncidentRepo;

    @Override
    public Collection<CrimeIncident> list(int limit) {
        log.info("Fetching crime incidents");
        return null;
    }
}
