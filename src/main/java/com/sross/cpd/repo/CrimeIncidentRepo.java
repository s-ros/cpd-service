package com.sross.cpd.repo;

import com.sross.cpd.domain.CrimeIncident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface CrimeIncidentRepo extends JpaRepository<CrimeIncident, Integer> {

    List<CrimeIncident> findByDateReportedBetween(Timestamp fromDate, Timestamp toDate);


}
