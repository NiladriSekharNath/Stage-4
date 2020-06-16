package com.cognizant.truyum.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.exception.MenuItemNotFoundException;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

@Repository
public class MenuItemDaoCollectionImpl implements MenuItemDao {
	
	private static List<MenuItem> MENU_ITEM_LIST;

	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemDaoCollectionImpl.class);

	public MenuItemDaoCollectionImpl() {
		ApplicationContext context = new ClassPathXmlApplicationContext("menuItem.xml");

		MENU_ITEM_LIST = (List<MenuItem>) context.getBean("menuItems");
		LOGGER.debug("MenuItems:{}", MENU_ITEM_LIST);

	}


	

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem>menuItemListCustomer=new ArrayList<MenuItem>();
		Date date=new Date();
		LocalDateTime localDateTime=LocalDateTime.now();
		String format = DateTimeFormatter.ofPattern("dd/mm/yyyy",Locale.ENGLISH).format(localDateTime);
		Date currentSystemDate = DateUtil.convertToDate(format);
		
				
		for(MenuItem menuItemIterator:MENU_ITEM_LIST) {
			if((menuItemIterator.isActive()==true)&&(menuItemIterator.getDateOfLaunch().compareTo(currentSystemDate)<0)){
				menuItemListCustomer.add(menuItemIterator);
				
			}
		}
	return menuItemListCustomer;
		
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		MenuItem menuItemRequired=null;
		try {
			menuItemRequired=getMenuItem(menuItem.getId());
			menuItemRequired.setName(menuItem.getName());
			menuItemRequired.setPrice(menuItem.getPrice());
			menuItemRequired.setActive(menuItem.isActive());
			menuItemRequired.setFreeDelivery(menuItem.isFreeDelivery());
		} catch (MenuItemNotFoundException e) {
			e.printStackTrace();
		}
		
			
	}

	@Override
	public MenuItem getMenuItem(long id) throws MenuItemNotFoundException {
		MenuItem menuItem =null;
		for(MenuItem menuItemIterator:MENU_ITEM_LIST) {
			if(menuItemIterator.getId()==id) {
				menuItem=menuItemIterator;
			}
		}
		if(menuItem==null) {
			throw new MenuItemNotFoundException("MenuItemNotFoundException");
		}
		else
			return menuItem;
	}

}
