package com.pgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pgs.schema.order.ObjectFactory;
import com.pgs.schema.order.OrderInquiryResponseType;
import com.pgs.schema.order.OrderInquiryType;
import com.pgs.service.orders.Orders;

@Controller("/processOrderPlacement")
public class OrdersController {

	@Autowired
	Orders orders;

	@RequestMapping(method = RequestMethod.GET)
	public String processOrderPlacement(ModelMap model) {

		OrderInquiryType orderInquiry = new ObjectFactory().createOrderInquiryType();
		orderInquiry.setAccountId(365489);
		orderInquiry.setEan13(5223564163L);
		orderInquiry.setOrderQuantity(54);
		orderInquiry.setUniqueOrderId(3);

		OrderInquiryResponseType response = orders.processOrderPlacement(orderInquiry);

		model.addAttribute("orderStatus", response.getOrder().getOrderStatus());

		return "processOrderPlacement";
	}

}
