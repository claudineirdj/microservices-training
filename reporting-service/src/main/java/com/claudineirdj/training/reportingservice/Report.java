package com.claudineirdj.training.reportingservice;

public class Report {

    private String tradeId;
    private EligibilityStatus eligibilityStatus;

    public Report(String tradeId, EligibilityStatus eligibilityStatus) {
        this.tradeId = tradeId;
        this.eligibilityStatus = eligibilityStatus;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public EligibilityStatus getEligibilityStatus() {
        return eligibilityStatus;
    }

    public void setEligibilityStatus(EligibilityStatus eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }
}
