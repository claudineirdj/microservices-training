package com.claudineirdj.training.reportingservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportResource {

    private static Logger LOGGER = LoggerFactory.getLogger(ReportResource.class);

    @Autowired
    private EligibilityService eligibilityService;

    @HystrixCommand(fallbackMethod = "getEligiblityForFallback")
    @RequestMapping(value = "/report/{tradeId}", method = RequestMethod.GET)
    public Report findReportForTrade(@PathVariable String tradeId) {
        LOGGER.info(String.format("Finding report for trade: %s", tradeId));
        EligibilityStatus eligibilityStatus = eligibilityService.getEligiblityFor(tradeId);
        LOGGER.info(String.format("Eligibility call succeed for: %s", tradeId));
        return new Report(tradeId, eligibilityStatus);
    }

    public Report getEligiblityForFallback(String tradeId) {
        LOGGER.error(String.format("Shit went wrong for: %s", tradeId));
        return new Report(null, null);
    }
}
