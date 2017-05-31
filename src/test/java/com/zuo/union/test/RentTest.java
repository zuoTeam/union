package com.zuo.union.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zuo.union.domain.Functions;
import com.zuo.union.domain.Letter;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.RentedHouse;
import com.zuo.union.domain.Type;
import com.zuo.union.domain.User;
import com.zuo.union.service.RentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-beans.xml")
public class RentTest {
	
	@Autowired
	private RentService rentServiceImpl;
	
	@Test
	public void getRentedHouse() throws Exception {
		String keyWord = "";
		
		PageBean<RentedHouse> pageBean = new PageBean<>();
		pageBean.setCurrentPage(1);
		
		Type type = new Type();
		type.setTypeId(2);
		
		List<RentedHouse> rentedHouse = rentServiceImpl.getRentedHouse(keyWord, pageBean, type);
		for (RentedHouse house : rentedHouse) {
			System.out.println(house.getHouseTitle());
		}
	}
	
	@Test
	public void getRentedHouseRows() throws Exception {
		String keyWord = "";
		
		Type type = new Type();
		type.setTypeId(2);

		int rentedHouseRows = rentServiceImpl.getRentedHouseRows(keyWord, type);
		System.out.println(rentedHouseRows);
	}
	
	@Test
	public void addLetter() throws Exception {
		Letter letter = new Letter();
		letter.setLetterTitle("你好啊");
		letter.setLetterDesc("Are you OK?");
		
		Date date = new Date();
		letter.setLetterDate(date);
		
		User publisher = new User();
		publisher.setUserId(1l);
		letter.setPublisher(publisher);
		
		User recipient = new User();
		recipient.setUserId(2l);
		letter.setRecipient(recipient);
		
		Functions func = new Functions();
		func.setFuncId(1);
		letter.setFunc(func);
		
		int addLetter = rentServiceImpl.addLetter(letter);
		System.out.println(addLetter);
	}
	
	@Test
	public void addRentHouse() throws Exception {
		User publisher = new User();
		publisher.setUserId(1l);
		
		Type type = new Type();
		type.setTypeId(1);
		
		RentedHouse rentedHouse = new RentedHouse();
		rentedHouse.setHouseTitle("来租");
		rentedHouse.setHouseDesc("123");
		rentedHouse.setHouseAddr("你猜");
		rentedHouse.setHouseDate(new Date());
		rentedHouse.setPublisher(publisher);
		rentedHouse.setType(type);
		
		int addRentHouse = rentServiceImpl.addRentHouse(rentedHouse);
		System.out.println(addRentHouse);
	}

}
