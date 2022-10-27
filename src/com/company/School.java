package com.company;

public class School {

    private Girl girl;
    private Boy boy;

    public School(Boy boy, Girl girl) {
        this.girl = this.girl;
        this.boy = this.boy;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    public Boy getBoy() {
        return boy;
    }

    public void setBoy(Boy boy) {
        this.boy = boy;
    }

    @Override
    public String toString() {
        return "School " +
                "girl" + girl +
                ", boy" + boy;
    }
}

