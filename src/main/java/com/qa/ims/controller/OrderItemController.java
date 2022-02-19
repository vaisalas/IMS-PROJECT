package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderItemDAO;
import com.qa.ims.persistence.domain.OrderItem;
import com.qa.ims.utils.Utils;

public class OrderItemController implements CrudController<OrderItem> {

	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderItemDAO orderitemDAO;
	private Utils utils;
	
	public OrderItemController(OrderItemDAO orderitemDAO, Utils utils) {
		super();
		this.orderitemDAO = orderitemDAO;
		this.utils = utils;
	}

	@Override
	public List<OrderItem> readAll() {
		List<OrderItem> orderitems = orderitemDAO.readAll();
		for (OrderItem orderitem : orderitems) {
			LOGGER.info(orderitem);
		}
		return orderitems;
	}
	@Override
	public OrderItem create() {
		LOGGER.info("Please enter the item ID");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter the order ID");
		Long orderId = utils.getLong();
		OrderItem orderitem = orderitemDAO.create(new OrderItem(itemId, orderId));
		LOGGER.info("Item is added to this order!");
		return orderitem;
	}

	@Override
	public OrderItem update() {
		LOGGER.info("Please enter the ID of the order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the item ID you wish to add to the order");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter the order ID again to update");
		Long orderId = utils.getLong();
		OrderItem orderitem = orderitemDAO.update(new OrderItem(id, itemId, orderId));
		LOGGER.info("Order Updated");
		return orderitem;
	}


	@Override
	public int delete() {
		LOGGER.info("Please enter the ID of the Order you would like to delete");
		Long id = utils.getLong();
//		LOGGER.info("Please enter the item ID you wish to delete from the order");
//		Long itemId = utils.getLong();
		LOGGER.info("Item Deleted");
		return orderitemDAO.delete(id);
		
	}
}
