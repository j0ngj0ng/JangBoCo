package com.gdj37.jangboco.web.dbapi.service;

import java.util.HashMap;

public interface DBApiServiceIF {

	public int addDisctData(HashMap<String, Object> params) throws Throwable;
	
	public int marketDuplctCheck(HashMap<String, Object> params) throws Throwable;
	
	public int addMarketData(HashMap<String, Object> params) throws Throwable;
	
	public int itemsDuplctCheck(HashMap<String, Object> params) throws Throwable;
	
	public int addItemsData(HashMap<String, Object> params) throws Throwable;
	
	public int addPricesData(HashMap<String, Object> params) throws Throwable;

	public int getMaxPricesNo() throws Throwable;

}
