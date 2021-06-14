/**
 * 
 */
package bajpai.edu.module11.assignment.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bajpai.edu.module11.assignment.dao.MobilePhoneDAO;

/**
 * @author Abhishek Bajpai
 * @date   Jun 12, 2021 
 * @       6:35:32 PM
 *
 */
public class TestMobilePhone {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	MobilePhoneDAO mobilePhoneDAO = context.getBean(MobilePhoneDAO.class);
	
	@Test
	public void testSaveMobile() {
		mobilePhoneDAO.saveMobile("Nokia", 100f, "RED", "Lumina");
	}
	
	@Test
	public void testUpdateMobile() {
		mobilePhoneDAO.updateMobile("Lumina", 99.9f);
	}
	
	@Test
	public void testDeleteMobile() {
		mobilePhoneDAO.deleteMobile("Lumina");
	}


}
