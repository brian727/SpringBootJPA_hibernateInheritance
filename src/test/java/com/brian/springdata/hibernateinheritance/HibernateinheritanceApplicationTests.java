package com.brian.springdata.hibernateinheritance;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.brian.springdata.hibernateinheritance.entities.Check;
import com.brian.springdata.hibernateinheritance.entities.CreditCard;
import com.brian.springdata.hibernateinheritance.repos.PaymentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class HibernateinheritanceApplicationTests {

	@Autowired
	PaymentRepository repository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createPayment()	{
		CreditCard cc = new CreditCard();
		cc.setId(2);
		cc.setAmount(1000);
		cc.setCardnumber("2222");
		repository.save(cc);
	}
	
	@Test
	public void createCheckPayment()	{
		Check ch = new Check();
		ch.setId(3);
		ch.setAmount(1000);
		ch.setChecknumber("1");
		repository.save(ch);
	}
}







