
package arihant.dto;

public class Repairing {
private String receiptNo;
private String marketingUserID;
private String companyName;
private String address;
private long contactNo;
private String services;
private int timeDuration;
private long maintenanceCost;

    public Repairing() {
    }

    public Repairing(String receiptNo, String marketingUserID, String companyName, String address, long contactNo, String services, int timeDuration, long maintenanceCost) {
        this.receiptNo = receiptNo;
        this.marketingUserID = marketingUserID;
        this.companyName = companyName;
        this.address = address;
        this.contactNo = contactNo;
        this.services = services;
        this.timeDuration = timeDuration;
        this.maintenanceCost = maintenanceCost;
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

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public int getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(int timeDuration) {
        this.timeDuration = timeDuration;
    }

    public long getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(long maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

   
}
