package com.zuo.union.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.RentedHouse;
import com.zuo.union.domain.Type;
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

}
