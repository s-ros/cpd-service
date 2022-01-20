package com.sross.cpd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrimeIncident {
    @Id
    private Integer id;
    private String instanceId;
    private String incidentNumber;
    private Timestamp dateReported;
    private Timestamp dateFrom;
    private Timestamp dateTo;
    private String closed;
    private String ucr;
    private String district;
    private String beat;
    private String offense;
    private String location;
    private String theftCode;
    private String floor;
    private String side;
    private String opening;
    private String hateBias;
    private String dayOfWeek;
    private String reportArea;
    private String cpdNeighborhood;
    private String weapons;
    private Timestamp dateOfClearance;
    private String hourFrom;
    private String hourTo;
    private String address;
    private String longitude;
    private String latitude;
    private String victimAge;
    private String victimRace;
    private String victimEthnicity;
    private String suspectAge;
    private String suspectRace;
    private String suspectEthnicity;
    private String suspectGender;
    private String numberOfVictims;
    private String totalSuspects;
    private String ucrGroup;
    private Integer zip;
    private String communityCouncilNeighborhood;
    private String snaNeighborhood;
}
