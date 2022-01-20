package com.sross.cpd.service.implementation;

import com.sross.cpd.domain.TrafficStop;
import com.sross.cpd.repo.TrafficStopRepo;
import com.sross.cpd.service.TrafficStopService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class TrafficStopImpl implements TrafficStopService {
    private final TrafficStopRepo trafficStopRepo;
    @Override
    public Collection<TrafficStop> list(int limit) {
        return null;
    }
}
