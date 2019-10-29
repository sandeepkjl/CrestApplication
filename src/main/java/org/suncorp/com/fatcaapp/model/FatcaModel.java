package org.suncorp.com.fatcaapp.model;

public class FatcaModel {
    private int GCSId;
    private String countryName;
    private String tin;
    private String reason;
    private boolean deleted;

    public FatcaModel() {
    }

    public FatcaModel(int GCSId, String countryName, String tin, String reason, boolean deleted) {
        this.GCSId = GCSId;
        this.countryName = countryName;
        this.tin = tin;
        this.reason = reason;
        this.deleted = deleted;
    }

    public int getGCSId() {
        return GCSId;
    }

    public void setGCSId(int GCSId) {
        this.GCSId = GCSId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "FatcaModel{" +
                "GCSId=" + GCSId +
                ", countryName='" + countryName + '\'' +
                ", tin='" + tin + '\'' +
                ", reason='" + reason + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
