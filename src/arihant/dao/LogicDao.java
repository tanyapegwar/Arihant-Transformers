
package arihant.dao;

import arihant.dto.Lamination;
import arihant.dto.Manufacturing;
import arihant.dto.Repairing;
import arihant.dto.Salary;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class LogicDao {
 
    private HibernateTemplate template;


public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }



    public void insertRecord(Lamination lamination)
    {
        
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException 
            {
                session.save(lamination);
                return null;
            }
        });
  
}
    
    public void insertRecord(Repairing repairing)
    {
        
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException 
            {
                session.save(repairing);
                return null;
            }
        });
  
}
    public void insertRecord(Manufacturing manufacturing)
    {
        
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException 
            {
                session.save(manufacturing);
                return null;
            }
        });
  
}
    
    public void displayRecord(Lamination lamination)
    {
        
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException 
            {
                Criteria crit=session.createCriteria(Lamination.class);
        
        List<Lamination> list=crit.list();
        if(list.isEmpty())
        {
            System.out.println("No Record Found");
        }
        else
        {
            for(Lamination ob:list)
           {
             String  ob1 =ob.getReceiptNo();
             String  ob2 =ob.getMarketingUserID();
             String  ob3 =ob.getCompanyName();
             String  ob4 =ob.getAddress();
             long  ob5 =ob.getContactNo();
             String  ob6 =ob.getLaminationType();
             String  ob7 =ob.getLaminationDesign();
             long ob8 =ob.getCost();
             Object obj[]={ob1,ob2,ob3,ob4,ob5,ob6,ob7,ob8};
             System.out.println(Arrays.toString(obj));
           }
        }
                return null;
            }
            });
            
}
    
    public void displayRecord1(Manufacturing manufacturing)
    {
        
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException 
            {
                Criteria crit=session.createCriteria(Manufacturing.class);
        
        List<Manufacturing> list=crit.list();
        if(list.isEmpty())
        {
            System.out.println("No Record Found");
        }
        else
        {
            for(Manufacturing ob:list)
           {
             String  ob1 =ob.getReceiptNo();
             String  ob2 =ob.getMarketingUserID();
             String  ob3 =ob.getCompanyName();
             String  ob4 =ob.getAddress();
             long  ob5 =ob.getContactNo();
             String  ob6 =ob.getTransformerType();
             String  ob7 =ob.getManufacturingDesign();
             String ob8 =ob.getMaterialUsed();
             String  ob9 =ob.getManufacturingProcesses();
             long ob10 =ob.getManufacturingCost();
             Object obj[]={ob1,ob2,ob3,ob4,ob5,ob6,ob7,ob8,ob9,ob10};
             System.out.println(Arrays.toString(obj));
           }
        }
                return null;
            }
            });
            
}
   
    
    public void displayRecord2(Repairing repairing)
    {
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException 
            {
                Criteria crit=session.createCriteria(Repairing.class);
        
        List<Repairing> list=crit.list();
        if(list.isEmpty())
        {
            System.out.println("No Record Found");
        }
        else
        {
            for(Repairing ob:list)
           {
             String  ob1 =ob.getReceiptNo();
             String  ob2 =ob.getMarketingUserID();
             String  ob3 =ob.getCompanyName();
             String  ob4 =ob.getAddress();
             long  ob5 =ob.getContactNo();
             String  ob6 =ob.getServices();
             int  ob7 =ob.getTimeDuration();
             long ob8 =ob.getMaintenanceCost();
             
             Object obj[]={ob1,ob2,ob3,ob4,ob5,ob6,ob7,ob8};
             System.out.println(Arrays.toString(obj));
     
           }
        }
                return null;
            }
            });
            
}
    
    public void insertRecord(Salary salary)
    {
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException 
            {
                session.save(salary);
                return null;
            }
        }); 
    } 
    
    public void displayRecord3(Salary salary)
    {
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException 
            {
                Criteria crit=session.createCriteria(Salary.class);
        
        List<Salary> list=crit.list();
        if(list.isEmpty())
        {
            System.out.println("No Record Found");
        }
        else
        {
            for(Salary ob:list)
           {
            
             String  ob1 =ob.getMarketingUserID();
             long  ob2 =ob.getSalary();
             long  ob3 =ob.getIncentives();
             Object obj[]={ob1,ob2,ob3};
             System.out.println(Arrays.toString(obj));
     
           }
        }
                return null;
            }
            });
            
    
 }
}