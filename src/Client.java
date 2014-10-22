import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TimerTask;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class Client {
	
	
	

	public static void main(String[] args){
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ses=factory.openSession();
		/*
		Transaction tx=ses.beginTransaction();
		
		InsBean ins=new InsBean();
		ins.setName("hello");
		ins.setPrice(123.4444);
		ses.save(ins);
		tx.commit();
		System.out.println("finish");
		*/
		
		
		try{
		File f=new File("Sample Data.txt");//"D:/BlackRock/Sample Data.txt"
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str;
		int i=1;
		
		
		while((str=br.readLine())!=null){
			System.out.println(i+" "+str);
			
			
			Transaction tx=ses.beginTransaction();
			String[] scur=str.split(":");
			String na=scur[0];
			float pr=Float.parseFloat(scur[1]);
			
			InsBean ins=new InsBean();
			ins.setSec(i);
			ins.setName(na);
			ins.setPrice(pr);
			ses.save(ins);
			tx.commit();
			
			str=br.readLine();
			System.out.println(i+" "+str);
			Transaction tx2=ses.beginTransaction();
			String[] scur2=str.split(":");
			String na2=scur2[0];
			float pr2=Float.parseFloat(scur2[1]);
			
			InsBean ins2=new InsBean();
			ins2.setSec(i);
			ins2.setName(na2);
			ins2.setPrice(pr2);
			ses.save(ins2);
			tx2.commit();
			
			str=br.readLine();
			System.out.println(i+" "+str);
			Transaction tx3=ses.beginTransaction();
			String[] scur3=str.split(":");
			String na3=scur3[0];
			float pr3=Float.parseFloat(scur3[1]);
			
			InsBean ins3=new InsBean();
			ins3.setSec(i);
			ins3.setName(na3);
			ins3.setPrice(pr3);
			ses.save(ins3);
			tx3.commit();
			
			str=br.readLine();
			System.out.println(i+" "+str);
			Transaction tx4=ses.beginTransaction();
			String[] scur4=str.split(":");
			String na4=scur4[0];
			float pr4=Float.parseFloat(scur4[1]);
			
			InsBean ins4=new InsBean();
			ins4.setSec(i);
			ins4.setName(na4);
			ins4.setPrice(pr4);
			ses.save(ins4);
			tx4.commit();
			
			i++;
			
			try {
			    Thread.sleep(1000);
			   } catch (InterruptedException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			   }
			
		}
		
		fr.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		ses.close();
		
	}
}
