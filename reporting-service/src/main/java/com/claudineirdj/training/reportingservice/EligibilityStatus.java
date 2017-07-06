package com.claudineirdj.training.reportingservice;

public class EligibilityStatus {

    private boolean isEligible;
    private CharSequence reason;
    private CharSequence generatedBy;

    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        isEligible = eligible;
    }

    public CharSequence getReason() {
        return reason;
    }

    public void setReason(CharSequence reason) {
        this.reason = reason;
    }

    public CharSequence getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(CharSequence generatedBy) {
        this.generatedBy = generatedBy;
    }
}
