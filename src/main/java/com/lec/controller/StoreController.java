package com.lec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lec.domain.Goods;
import com.lec.service.GoodsService;

@Controller
public class StoreController {
	
	@Autowired
	private GoodsService goodsService;
	
	@GetMapping("/store_list")
	public String phoneMain(Goods goods, Model model) {
		List<Goods> allGoodsList = goodsService.getAllGoods(goods);
		for(Goods good:allGoodsList) {
			System.out.println(goods.toString());
		}
		
		
		model.addAttribute("allGoodsList", allGoodsList);
		
		return "store/store_list";
	}
	
	@GetMapping("/store_info")
	public String storeInfo(Goods goods) {
		
		return "store/store_info";
	}
	
	

}
