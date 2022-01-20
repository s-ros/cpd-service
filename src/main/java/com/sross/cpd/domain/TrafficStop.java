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
public class TrafficStop {
    @Id
    private Integer id;
    private String address;
    private double latitude;
    private double longitude;
    private String agency;
    private String disposition;
    private String eventNumber;
    private String incidentTypeDescription;
    private String incidentTypeId;
    private String actionTakenCid;
    private String actionTakenCidId;
    private String priority;
    private String instanceId;
    private String isJuvenile;
    private String interviewNumber;
    private Timestamp interviewDate;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleYear;
    private String contactTypeCid;
    private String licensePlateState;
    private String officerAssignment;
    private String reportTypeCid;
    private String sex;
    private String race;
    private String fieldSubjectCid;
    private String ageRangeCid;
    private String beat;
    private String communityCouncilNeighborhood;
    private String snaNeighborhood;
    private String cpdNeighborhood;
    private String district;
}
