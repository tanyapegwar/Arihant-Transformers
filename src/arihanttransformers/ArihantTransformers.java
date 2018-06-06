package arihanttransformers;

import arihant.dao.LogicDao;
import arihant.dto.Lamination;
import arihant.dto.Manufacturing;
import arihant.dto.Repairing;
import arihant.dto.Salary;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ArihantTransformers {
   
    public static void main(String[] args) {
ApplicationContext   context=new ClassPathXmlApplicationContext("/SpringXMLconfig.xml");
        LogicDao lo=(LogicDao)context.getBean("arihant");
        Scanner sc=new Scanner(System.in);
       System.out.println("WELCOME TO ARIHANT TRANSFORMERS-Give chance to provide our services \n");
       System.out.println("Select 1 if you are OWNER\n");
       System.out.println("Select 2 if you are Marketing User\n");
       System.out.println("Select 3 if you are Accountant\n");
        int select=sc.nextInt();
        switch(select)
        {
        case 1:
        System.out.println("Welcome Owner!,Please input your username and password for verification\n");
         System.out.println("Provide the Username");
        String username =sc.next();
        System.out.println("Input your Password");
        String password =sc.next();
        if(username.equals("arihant") && password.equals("arihant"))
        {
            System.out.println("Please approve/disapprove the task ");
        }
        else
        {
            System.out.println("USERNAME OR PASSWORD IS WRONG");
        }      
{
    System.out.println("Details of Lamaination Department");
    Lamination obj = null;
    lo.displayRecord(obj);
    System.out.println("\n");
}
{
        System.out.println("Details of Manufacturing Department");
    Manufacturing obj = null;
    lo.displayRecord1(obj);
        System.out.println("\n");

}
{
    System.out.println("Details of Repairing Department");
    Repairing obj = null;
    lo.displayRecord2(obj);
        System.out.println("\n");
}
{
    System.out.println("Details of Salary for Marketing User");
    Salary obj = null;
    lo.displayRecord3(obj);
        System.out.println("\n");
}
      
        break;
        case 2:
      
        System.out.println("Select 1 for Lamination");
        System.out.println("Select 2 for Repairing");
        System.out.println("Select 3 for Manufacturing");

        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("----------Input the details for lamination of transformer----------\n");
                System.out.println("Enter receipt number for lamination of transformer");
                String receiptNo=sc.next();
                System.out.println("Enter Marketing UserId who is incharge for lamination of transformer");
                String marketingUserID=sc.next();
                System.out.println("Enter company Name for lamination of transformer");
                String companyName=sc.next();
                System.out.println("Enter address for lamination of transformer");
                String address=sc.next();
                System.out.println("Enter contact Number for lamination of transformer");
                long contactNo=sc.nextLong();
                System.out.println("Describe Type of  lamination for transformer");
                String laminationType=sc.next();
                System.out.println("Describe design of lamination for transformer");
                String laminationDesign=sc.next();
                System.out.println("Enter Cost for lamination of transformer");
                long cost=sc.nextLong();
                Lamination lamination=new Lamination(receiptNo,marketingUserID,companyName,address,contactNo,laminationType,laminationDesign,cost);
                 lo.insertRecord(lamination);
                break;
        case 2:
             System.out.println("----------Input the details for repairing of transformer----------\n");
                System.out.println("Enter receipt number for repairing of transformer");
                String receipts=sc.next();
                System.out.println("Enter Marketing UserId who is incharge for repairing of transformer");
                String marketingUser=sc.next();
                System.out.println("Enter company Name for repairing of transformer");
                String companyNames=sc.next();
                System.out.println("Enter address for repairing of transformer");
                String addresses=sc.next();
                System.out.println("Enter contact Number for repairing of transformer");
                long contacts=sc.nextLong();
                System.out.println("Describe types of services needed for repairing of transformer");
                String services=sc.next();
                System.out.println("Enter time duration(in Days) for repairing of transformer");
                int timeDuration=sc.nextInt();
                System.out.println("Enter Maintenance Cost for repairing of transformer");
                long maintenanceCost=sc.nextLong();
                Repairing repairing=new Repairing(receipts,marketingUser,companyNames,addresses,contacts,services,timeDuration,maintenanceCost);
                lo.insertRecord(repairing);    
            break;
                 
        case 3:
        
        System.out.println("----------Input the details for manufacturing of transformer----------\n");
                System.out.println("Enter receipt number for manufacturing of transformer");
                String receipt=sc.next();
                System.out.println("Enter Marketing UserId who is incharge for manufacturing of transformer");
                String marketingUsers=sc.next();
                System.out.println("Enter company Name for manufacturing of transformer");
                String compName=sc.next();
                System.out.println("Enter address for manufacturing of transformer");
                String add=sc.next();
                System.out.println("Enter contact Number for manufacturing of transformer");
                long cont=sc.nextLong();
                System.out.println("Describe Type of manufacturing for transformer");
                String transformerType=sc.next();
                System.out.println("Describe Manufacturing Design of manufacturing for transformer");
                String manufacturingDesign=sc.next();
                System.out.println("Enter Material Used in  manufacturing of transformer");
                String materialUsed=sc.next();
                System.out.println("Describe Manufacturing Processes  for transformer");
                String manufacturingProcesses=sc.next();
                System.out.println("Enter Manufacturing Cost of transformer");
                long manufacturingCost=sc.nextLong();
                Manufacturing manufacturing=new Manufacturing(receipt,marketingUsers,compName,add,cont,transformerType,manufacturingDesign,materialUsed,manufacturingProcesses,manufacturingCost);
                 lo.insertRecord(manufacturing); 
                 break;
        default:
          System.out.println("Service not provided");
          break;
    }
        case 3:
            System.out.println("WELCOME ACCOUNTANT\n");
            System.out.println("Provide the Username");
        String name =sc.next();
        System.out.println("Input your Password");
        String pass =sc.next();
        if(name.equals("arihant") && pass.equals("arihant"))
        {
            System.out.println("Enter Marketing Users ID\n");
            String marketingUserID=sc.next();
            System.out.println("According to marketing user work decide his/her salary and increase the incentives\n");
            System.out.println("Enter Salary for respective Marketing Users\n");
            long sal=sc.nextInt();
            System.out.println("Enter Incentives for respective Marketing Users\n");
            long incentives=sc.nextInt();
            Salary salary=new Salary(marketingUserID,sal,incentives);
            lo.insertRecord(salary);
        }
        else
        {
            System.out.println("USERNAME OR PASSWORD IS WRONG");
        }
           
            break;
            
        default:
            System.out.println("Looks like you doesn't belong to ARIHANT TRANSFORMERS");
            break;
  }    
}
}