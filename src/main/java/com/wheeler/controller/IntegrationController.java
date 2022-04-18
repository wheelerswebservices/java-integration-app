package com.wheeler.controller;

import com.wheeler.annotation.Intercept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/integration")
@Slf4j
public class IntegrationController {

    @Intercept
    @GetMapping("/intercept")
    public ResponseEntity<?> intercept(){
      log.info("intercept");
      return ResponseEntity.status(204).build();
    }
}
