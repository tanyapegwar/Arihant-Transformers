
package arihant.dto;

public class Manufacturing {
    
private String receiptNo;
private String marketingUserID;
private String companyName;
private String address;
private long contactNo;
private String transformerType;
private String manufacturingDesign;
private String materialUsed;
private String manufacturingProcesses;
private long manufacturingCost; 

    public Manufacturing() {
    }

    public Manufacturing(String receiptNo, String marketingUserID, String companyName, String address, long contactNo, String transformerType, String manufacturingDesign, String materialUsed, String manufacturingProcesses, long manufacturingCost) {
        this.receiptNo = receiptNo;
        this.marketingUserID = marketingUserID;
        this.companyName = companyName;
        this.address = address;
        this.contactNo = contactNo;
        this.transformerType = transformerType;
        this.manufacturingDesign = manufacturingDesign;
        this.materialUsed = materialUsed;
        this.manufacturingProcesses = manufacturingProcesses;
        this.manufacturingCost = manufacturingCost;
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

    public String getTransformerType() {
        return transformerType;
    }

    public void setTransformerType(String transformerType) {
        this.transformerType = transformerType;
    }

    public String getManufacturingDesign() {
        return manufacturingDesign;
    }

    public void setManufacturingDesign(String manufacturingDesign) {
        this.manufacturingDesign = manufacturingDesign;
    }

    public String getMaterialUsed() {
        return materialUsed;
    }

    public void setMaterialUsed(String materialUsed) {
        this.materialUsed = materialUsed;
    }

    public String getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(String manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }

    public long getManufacturingCost() {
        return manufacturingCost;
    }

    public void setManufacturingCost(long manufacturingCost) {
        this.manufacturingCost = manufacturingCost;
    }

    

}
