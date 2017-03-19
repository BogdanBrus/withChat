package javaTest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.mvcedit.models.Message;
import org.mvcedit.models.Partner;

import daoImpl.TempDaoImpl;
import factory.Factory;

public class testFactory {

	public static void test(){
		
		//create member of table
		/*Partner partner = new Partner();
		partner.setPhone(3121453);
		partner.setFacebook("newfacebook");
		partner.setBankUser("00000000");
		partner.setVk("newVk");
		partner.setFirstName("newFirstName");;
		partner.setTechniks("newTechniks");
		partner.setSite("newSite");
		partner.setoSebe("newOSebe");
		partner.setLastName("унднп");
	
		
		//create fabric obj for work with dataBase
		Factory factory = Factory.getInstance();
		TempDaoImpl tempDaoImpl= factory.getPartnersDao(partner);
		
		tempDaoImpl.updateObj(partner);
		
			*/
		
		
		
		//Output
		//List list = tempDaoImpl.getListObj();
		//int a = 1;
		/*
		for(Object p: list ) {
			System.out.println("Partner #"+a+"  =   "+ ((Partner)p ).getPhone());
			a++;
		}
		*/
		
		
		
		//System.out.println("Partner #"+a+"  =   "+p.getPhone());
		
		//For ADD
		/***********************************
		Partner partner = new Partner();
		partner.setBankUser("setBankUser");
		partner.setFacebook("setFacebook");
		partner.setVk("setVk");
		partner.setFirstName("setFirstName");;
		partner.setLastName("setLastName");
		partner.setPhone(333333333);
		partner.setTechniks("setTechniks");
		partner.setSite("setSite");
		partner.setoSebe("setoSebe");
		
		partnersDao.addPartner(partner);
		*******************************
		*/
		
		
		//For DELETE
		/***********************************
		Partner partner = new Partner();
		partner.setPhone(555);
		
		partnersDao.deletePartner(partner);
		***********************************/
		
		//For getLIST
		/*********************************** 
		List<Partner> list =  partnersDao.getListPartner();
		int a = 1;
		for(Partner p: list ) {
			System.out.println("Partner #"+a+"  =   "+p.getPhone());
			a++;
		}
		**************************************/
		
		
		//For GET
		/************************************
		Partner partner = partnersDao.getPartner(78685555);
		if( partner != null) System.out.println(partner.getBankUser());
	    ***********************************/
		
		/*********************MESSAGE TEST***************
		Message message = new Message();
	
		Factory factory = Factory.getInstance();
		TempDaoImpl tempDaoImpl= factory.getObjDao(message);
		
		
		
		try {
			List<Object> list = tempDaoImpl.getListObj();
			Iterator<Object> it = list.iterator();
			
			while(it.hasNext()){
				Message mas =(Message) it.next();
				System.out.println(mas.getTime());	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	/************************************/
		
		//System.out.println("End");
		Message message = new Message();
		TempDaoImpl MessageDao = Factory.getTempDaoImpl(message);
		
		

	}

}
