package com.demo.mapsaddress.model;

public class SendLocation {

     String ERROR;

     String STATUSCODE;
     String MESSAGE;

    public SendLocation(String ERROR, String STATUSCODE, String MESSAGE) {
        this.ERROR = ERROR;
        this.STATUSCODE = STATUSCODE;
        this.MESSAGE = MESSAGE;
    }

    public String getERROR() {
        return ERROR;
    }

    public void setERROR(String ERROR) {
        this.ERROR = ERROR;
    }

    public String getSTATUSCODE() {
        return STATUSCODE;
    }

    public void setSTATUSCODE(String STATUSCODE) {
        this.STATUSCODE = STATUSCODE;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }
}
