
package arihant.dto;


public class Salary {
    private String marketingUserID;
    private long salary;
    private long incentives;

    public Salary() {
    }

    public Salary(String marketingUserID, long salary, long incentives) {
        this.marketingUserID = marketingUserID;
        this.salary = salary;
        this.incentives = incentives;
    }

    public String getMarketingUserID() {
        return marketingUserID;
    }

    public void setMarketingUserID(String marketingUserID) {
        this.marketingUserID = marketingUserID;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getIncentives() {
        return incentives;
    }

    public void setIncentives(long incentives) {
        this.incentives = incentives;
    }

   
}
