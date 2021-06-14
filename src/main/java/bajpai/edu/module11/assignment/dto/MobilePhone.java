/**
 * 
 */
package bajpai.edu.module11.assignment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Abhishek Bajpai
 * @date   Jun 12, 2021 
 * @       5:54:52 PM
 *
 */

@Entity
@Table(name="MOBILES")
@Data@AllArgsConstructor@NoArgsConstructor@ToString@EqualsAndHashCode@Component
public class MobilePhone {

	@Column(name = "MANUFACTURER_NAME")
	private String manufacturerName;
	
	@Column(name = "PRICE")
	private float price;
	
	@Column(name = "COLOR")
	private String color;

	//We will be deleting based on the model
	@Column(name = "MODEL")@PrimaryKeyJoinColumn @Id
	private String model;
	
	
	
}
