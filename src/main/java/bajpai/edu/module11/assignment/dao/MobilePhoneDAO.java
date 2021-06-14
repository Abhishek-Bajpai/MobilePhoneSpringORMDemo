/**
 * 
 */
package bajpai.edu.module11.assignment.dao;


import javax.transaction.Transactional;

import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import bajpai.edu.module11.assignment.dto.MobilePhone;
import lombok.Data;

/**
 * @author Abhishek Bajpai
 * @date   Jun 12, 2021 
 * @       6:22:11 PM
 *
 */
@Component@Data
public class MobilePhoneDAO {
	@Autowired
	private HibernateTemplate template;
	
	@Transactional
	public void saveMobile(String manufacturerName, float price, String color, String model) {
		//template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
		template.save(new MobilePhone(manufacturerName, price, color, model));
		System.out.println("Mobile phone SAVED");
	}
	
	@Transactional
	public void deleteMobile(String model) {
		MobilePhone mobilePhone = template.get(MobilePhone.class, model);
		template.delete(mobilePhone);
		System.out.println("Mobile Phone removed");
	}
	
	@Transactional
	public void updateMobile(String model, float price) {
		MobilePhone mobilePhone = template.get(MobilePhone.class, model);
		mobilePhone.setPrice(price);
		System.out.println("Price UPDATED for the Mobile Phone " + model);
	}
	
}
