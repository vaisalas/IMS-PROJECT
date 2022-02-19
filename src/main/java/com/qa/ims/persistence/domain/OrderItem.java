package com.qa.ims.persistence.domain;

public class OrderItem {

	private Long id;
	private Long Orderid;
	private Long itemId;

	public OrderItem(Long orderid, Long itemId) {
		super();
		Orderid = orderid;
		this.itemId = itemId;
	}

	public OrderItem(Long id, Long orderid, Long itemId) {
		super();
		this.id = id;
		Orderid = orderid;
		this.itemId = itemId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderid() {
		return Orderid;
	}

	public void setOrderid(Long orderid) {
		Orderid = orderid;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "Orderitem [id=" + id + ", Orderid=" + Orderid + ", itemId=" + itemId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Orderid == null) ? 0 : Orderid.hashCode());
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
		OrderItem other = (OrderItem) obj;
		if (getOrderid() == null) {
			if (other.getOrderid() != null)
				return false;
		} else if (!getOrderid().equals(other.getOrderid()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Orderid == null) {
			if (other.Orderid != null)
				return false;
		} else if (!Orderid.equals(other.Orderid))
			return false;
		return true;
	}

}
