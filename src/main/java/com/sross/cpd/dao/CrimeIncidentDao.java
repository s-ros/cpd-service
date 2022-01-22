package com.sross.cpd.dao;

import com.sross.cpd.domain.CrimeIncident;
import com.sross.cpd.request.CrimeIncidentRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CrimeIncidentDao {

    private final JdbcTemplate jdbcTemplate;

    public CrimeIncidentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<CrimeIncident> getCrimeIncidentReportsBy(CrimeIncidentRequest crimeIncidentRequest) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("date", " AND date_reported >= TO_TIMESTAMP('"  + crimeIncidentRequest.getStartDate() + "', 'YYYY-MM-DD')" + " AND date_reported <= TO_TIMESTAMP('"  + crimeIncidentRequest.getEndDate() + "', 'YYYY-MM-DD')");
        crimeIncidentRequest.getDistrict().ifPresent(district -> paramMap.put("district", " AND dst = " + district));
        crimeIncidentRequest.getUcr().ifPresent(ucr -> paramMap.put("ucr", " AND ucr = " + ucr));
        crimeIncidentRequest.getVictimRace().ifPresent(victimRace -> paramMap.put("victimRace", " AND victim_race = " + victimRace));
        crimeIncidentRequest.getVictimGender().ifPresent(victimGender -> paramMap.put("victimGender", " AND victim_gender = " + victimGender));
        crimeIncidentRequest.getVictimGender().ifPresent(victimAge -> paramMap.put("victimAge", " AND victim_age = " + victimAge));
        crimeIncidentRequest.getSuspectRace().ifPresent(suspectRace -> paramMap.put("suspectRace", " AND suspect_race = " + suspectRace));
        crimeIncidentRequest.getSuspectGender().ifPresent(suspectGender -> paramMap.put("suspectGender", " AND suspect_gender = " + suspectGender));
        crimeIncidentRequest.getSuspectAge().ifPresent(suspectAge -> paramMap.put("suspectAge", " AND suspect_age = " + suspectAge));
        StringBuilder sql = new StringBuilder("SELECT * FROM \"CRIME_INCIDENTS\" WHERE 1 = 1 ");
        paramMap.values().forEach(sql::append);
        return jdbcTemplate.query(sql.toString(),
                rs -> {

                    List<CrimeIncident> list = new ArrayList<>();
                    while (rs.next()) {
                        CrimeIncident crimeIncident = new CrimeIncident();
                        crimeIncident.setId(rs.getInt("id"));
                        crimeIncident.setInstanceId(rs.getString("instanceid"));
                        crimeIncident.setIncidentNumber(rs.getString("incident_no"));
                        crimeIncident.setDateReported(rs.getTimestamp("date_reported"));
                        crimeIncident.setDateFrom(rs.getTimestamp("date_from"));
                        crimeIncident.setDateTo(rs.getTimestamp("date_to"));
                        crimeIncident.setClosed(rs.getString("clsd"));
                        crimeIncident.setUcr(rs.getString("ucr"));
                        crimeIncident.setDistrict(rs.getString("dst"));
                        crimeIncident.setBeat(rs.getString("beat"));
                        crimeIncident.setOffense(rs.getString("offense"));
                        crimeIncident.setLocation(rs.getString("location"));
                        crimeIncident.setTheftCode(rs.getString("theft_code"));
                        crimeIncident.setFloor(rs.getString("floor"));
                        crimeIncident.setSide(rs.getString("side"));
                        crimeIncident.setOpening(rs.getString("opening"));
                        crimeIncident.setHateBias(rs.getString("hate_bias"));
                        crimeIncident.setDayOfWeek(rs.getString("dayofweek"));
                        crimeIncident.setReportArea(rs.getString("rpt_area"));
                        crimeIncident.setCpdNeighborhood(rs.getString("cpd_neighborhood"));
                        crimeIncident.setWeapons(rs.getString("weapons"));
                        crimeIncident.setDateOfClearance(rs.getTimestamp("date_of_clearance"));
                        crimeIncident.setHourFrom(rs.getString("hour_from"));
                        crimeIncident.setHourTo(rs.getString("hour_to"));
                        crimeIncident.setAddress(rs.getString("address_x"));
                        crimeIncident.setLongitude(rs.getString("longitude_x"));
                        crimeIncident.setLatitude(rs.getString("latitude_x"));
                        crimeIncident.setVictimRace(rs.getString("victim_race"));
                        crimeIncident.setVictimEthnicity(rs.getString("victim_ethnicity"));
                        crimeIncident.setVictimGender(rs.getString("victim_gender"));
                        crimeIncident.setSuspectAge(rs.getString("suspect_age"));
                        crimeIncident.setSuspectRace(rs.getString("suspect_race"));
                        crimeIncident.setSuspectEthnicity(rs.getString("suspect_ethnicity"));
                        crimeIncident.setSuspectGender(rs.getString("suspect_gender"));
                        crimeIncident.setNumberOfVictims(rs.getString("totalnumbervictims"));
                        crimeIncident.setTotalSuspects(rs.getString("totalsuspects"));
                        crimeIncident.setUcrGroup(rs.getString("ucr_group"));
                        crimeIncident.setZip(rs.getInt("zip"));
                        crimeIncident.setCommunityCouncilNeighborhood(rs.getString("community_council_neighborhood"));
                        crimeIncident.setSnaNeighborhood(rs.getString("sna_neighborhood"));
                        list.add(crimeIncident);
                    }
                    return list;
                });
    }
}
