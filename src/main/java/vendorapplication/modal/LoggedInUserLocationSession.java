package vendorapplication.modal;

import java.io.Serializable;

public class LoggedInUserLocationSession implements Serializable {

    private  Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private Integer TehsilId;
    private Integer panchayatId;
    private Long userID;

    public LoggedInUserLocationSession(Integer stateId, Integer districtId, Integer blockId, Integer tehsilId, Integer panchayatId, Long userID) {
        this.stateId = stateId;
        this.districtId = districtId;
        this.blockId = blockId;
        TehsilId = tehsilId;
        this.panchayatId = panchayatId;
        this.userID = userID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public Integer getTehsilId() {
        return TehsilId;
    }

    public void setTehsilId(Integer tehsilId) {
        TehsilId = tehsilId;
    }

    public Integer getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Integer panchayatId) {
        this.panchayatId = panchayatId;
    }

    @Override
    public String toString() {
        return "LoggedInUserLocationSession{" +
                "stateId=" + stateId +
                ", districtId=" + districtId +
                ", blockId=" + blockId +
                ", TehsilId=" + TehsilId +
                ", panchayatId=" + panchayatId +
                ", userID=" + userID +
                '}';
    }
}
