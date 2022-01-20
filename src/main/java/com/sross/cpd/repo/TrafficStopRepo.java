package com.sross.cpd.repo;

import com.sross.cpd.domain.TrafficStop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface TrafficStopRepo extends JpaRepository<TrafficStop, Integer> {

    List<TrafficStop> findByInterviewDateBetween(Timestamp fromDate, Timestamp toDate);

}
