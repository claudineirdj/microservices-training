package com.claudineirdj.training.eligibilityservice;

public class EligibilityStatus {

    private boolean isEligible;
    private CharSequence reason;
    private CharSequence generatedBy;

    public EligibilityStatus(boolean isEligible, CharSequence reason, CharSequence generatedBy) {
        this.isEligible = isEligible;
        this.reason = reason;
        this.generatedBy = generatedBy;
    }

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
