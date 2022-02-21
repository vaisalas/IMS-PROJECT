package com.qa.ims.persistence.domain;

public class Order {

	private Long id;
	private Long customersId;
	private Long itemId;

	public Order(Long id, Long customersId) {
		this.id = id;
		this.customersId = customersId;
	}

	public Order(Long id, Long customersId, Long itemId) {
		this.id = id;
		this.customersId = customersId;
		this.itemId = itemId;
	}
	

	public Long getId() {
		return id;
	}

	public Order(Long customersId) {
		super();
		this.customersId = customersId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customersId;
	}

	public void setCustomerId(Long customerId) {
		this.customersId = customerId;
	}

//	public Long getItemId() {
//		return itemId;
//	}

//	public void setItemId(Long itemId) {
//		this.itemId = itemId;
//	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customersId=" + customersId + ", itemId=" + itemId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customersId == null) ? 0 : customersId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (getCustomerId() == null) {
			if (other.getCustomerId() != null)
				return false;
		} else if (!getCustomerId().equals(other.getCustomerId()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		return true;
	}

}