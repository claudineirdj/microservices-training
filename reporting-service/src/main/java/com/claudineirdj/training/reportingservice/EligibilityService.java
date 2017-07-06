package com.claudineirdj.training.reportingservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(EligibilityService.ELIGIBILITY_SERVICE)
public interface EligibilityService {

    String ELIGIBILITY_SERVICE = "ELIGIBILITY-SERVICE";

    @RequestMapping("/eligibility/{tradeId}")
    EligibilityStatus getEligiblityFor(@PathVariable("tradeId") String tradeId);
}
