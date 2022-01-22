package com.sross.cpd.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import java.util.Optional;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
public class CrimeIncidentRequest {
    @NotEmpty(message = "startDate can not be empty or null")
    private String startDate;
    @NotEmpty(message = "endDate can not be empty or null")
    private String endDate;
    private String district;
    private String ucr;
    private String victimRace;
    private String victimGender;
    private String victimAge;
    private String suspectRace;
    private String suspectGender;
    private String suspectAge;

    public Optional<String> getDistrict() {
        return Optional.ofNullable(this.district);
    }

    public Optional<String> getUcr() {
        return Optional.ofNullable(this.ucr);
    }

    public Optional<String> getVictimRace() {
        return Optional.ofNullable(this.victimRace);
    }

    public Optional<String> getVictimGender() {
        return Optional.ofNullable(this.victimGender);
    }

    public Optional<String> getVictimAge() {
        return Optional.ofNullable(this.victimAge);
    }

    public Optional<String> getSuspectRace() {
        return Optional.ofNullable(this.suspectRace);
    }

    public Optional<String> getSuspectGender() {
        return Optional.ofNullable(this.suspectGender);
    }

    public Optional<String> getSuspectAge() {
        return Optional.ofNullable(this.suspectAge);
    }


}
