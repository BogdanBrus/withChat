package factory;

import org.mvcedit.models.Partner;

import daoImpl.TempDaoImpl;


public class Factory{
	public static Factory instance = new Factory();
	private TempDaoImpl partnersTest;
	//private Partner partner;
	
	public static Factory getInstance(){
		return Factory.instance;
	}
	
	public TempDaoImpl getPartnersDao(Partner partner){
		partnersTest = new TempDaoImpl( partner.getClass());
		return partnersTest;
	}
	

}
