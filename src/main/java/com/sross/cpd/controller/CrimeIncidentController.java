package com.sross.cpd.controller;

import com.sross.cpd.domain.ApiResponse;
import com.sross.cpd.request.CrimeIncidentRequest;
import com.sross.cpd.service.implementation.CrimeIncidentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/crime-incidents")
@RequiredArgsConstructor
public class CrimeIncidentController {
    private final CrimeIncidentServiceImpl crimeIncidentService;

    @GetMapping("/get-crime-incidents")
    public ResponseEntity<ApiResponse> getCrimeIncidents(@RequestBody @Valid CrimeIncidentRequest crimeIncidentRequest) {
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .timeStamp(now())
                        .data(Map.of("crimeIncidents", crimeIncidentService.getCrimeIncidentsBy(crimeIncidentRequest)))
                        .message("crime incidents retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());
    }

    @GetMapping("test")
    public ResponseEntity<ApiResponse> test() {
        return ResponseEntity.ok(ApiResponse.builder().build());
    }
}
