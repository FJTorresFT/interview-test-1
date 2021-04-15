package eu.cec.digit.comref.interview.persistent.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WATCH")
public class Watch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 349533338490577533L;
	
	public Watch() {
		
	}

	public Watch(String name, Integer value, Integer sold, Boolean available) {

		this.name = name;
		this.value = value;
		this.sold = sold;
//		this.available = 1;
		if (Objects.nonNull(available) && available)
			this.available = 1;
		else
			this.available = 0;
	}

	@Id
//	@Column(name = "NAME", length = 25)
	@Column(name = "NAME", length = 55)
	private String name;

	@Column(name = "value")
	private Integer value;

	@Column(name = "sold")
	private Integer sold;

	@Column(name = "available")
	private Integer available;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getSold() {
		return sold;
	}

	public void setSold(Integer sold) {
		this.sold = sold;
	}

	public Boolean getAvailable() {
//		return true;
		if (this.available.equals(1))
			return true;
		else
			return false;
		
	}

	public void setAvailable(Boolean available) {
//		this.available = 2;
		if (Objects.nonNull(available) && available)
			this.available = 1;
		else
			this.available = 0;

	}

}
