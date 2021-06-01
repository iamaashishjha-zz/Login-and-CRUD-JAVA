
package com.ls.bll;


public class Student {
    private int SID;
    private String sName;
    private String sAddress;
    private String sCourse;

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsCourse() {
        return sCourse;
    }

    public void setsCourse(String sCourse) {
        this.sCourse = sCourse;
    }
}
