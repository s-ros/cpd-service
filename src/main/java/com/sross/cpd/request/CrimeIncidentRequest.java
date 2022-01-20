package com.sross.cpd.request;

import java.sql.Timestamp;

public class CrimeIncidentRequest {
    private Timestamp fromDate;
    private Timestamp toDate;
    private String district;
    private String ucr;
    private String victimRace;
    private String victimGender;
    private String victimAge;
    private String suspectRace;
    private String suspectGender;
    private String suspectAge;
}
