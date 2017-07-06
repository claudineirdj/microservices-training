package com.claudineirdj.training.eligibilityservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class EligibilityResource {

    private static Logger LOGGER = LoggerFactory.getLogger(EligibilityResource.class);

    @Value("${spring.profiles}")
    private CharSequence profile;
    @Value("${testProperty}")
    private CharSequence testProperty;

    @RequestMapping(value = "/eligibility/{tradeId}", method = RequestMethod.GET)
    public EligibilityStatus getEligiblityFor(@PathVariable String tradeId) {
        LOGGER.info(String.format("Request for Eligibility of: %s", tradeId));
        return tradeId.equals("123") ?
                new EligibilityStatus(true, "N/A", profile + "-" + testProperty) :
                new EligibilityStatus(false, "Non Eligible for whatever reason",
                        profile + "-" + testProperty);
    }
}
