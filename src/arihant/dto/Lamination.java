
package arihant.dto;


public class Lamination {
     
private String receiptNo;
private String marketingUserID;
private String companyName;
private String address;
private long contactNo;
private String laminationType;
private String laminationDesign;
private long cost;


    public Lamination() {
    }

    public Lamination(String receiptNo, String marketingUserID, String companyName, String address, long contactNo, String laminationType, String laminationDesign, long cost) {
        this.receiptNo = receiptNo;
        this.marketingUserID = marketingUserID;
        this.companyName = companyName;
        this.address = address;
        this.contactNo = contactNo;
        this.laminationType = laminationType;
        this.laminationDesign = laminationDesign;
        this.cost = cost;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getMarketingUserID() {
        return marketingUserID;
    }

    public void setMarketingUserID(String marketingUserID) {
        this.marketingUserID = marketingUserID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getLaminationType() {
        return laminationType;
    }

    public void setLaminationType(String laminationType) {
        this.laminationType = laminationType;
    }

    public String getLaminationDesign() {
        return laminationDesign;
    }

    public void setLaminationDesign(String laminationDesign) {
        this.laminationDesign = laminationDesign;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

  
}
