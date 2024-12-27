package com.simactivation.portal.SimService.controller;

import com.simactivation.portal.SimService.dto.SimDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/sim")
public class SimController {

    @GetMapping("/details/{serviceNumber}")
    public ResponseEntity<SimDTO> getSimDetails(@PathVariable int serviceNumber){
        return null;
    }

    @PostMapping("/validate")
    public ResponseEntity<String> validate(@RequestBody @Valid SimDTO simDTO){

        return null;
    }

    @PostMapping("/activate")
    public ResponseEntity<String> activate(@RequestBody @Valid SimDTO simDTO){

        return null;
    }

}
