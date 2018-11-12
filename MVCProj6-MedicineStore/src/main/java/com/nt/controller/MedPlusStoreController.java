package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.MedicineDetailsDTO;
import com.nt.service.MedicineService;

public class MedPlusStoreController extends AbstractController {
	private MedicineService service;

	public MedPlusStoreController(MedicineService service) {
		
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<MedicineDetailsDTO> listDTO=null;
		listDTO=service.getMedicineDetails();
		System.out.println(listDTO);
		return new ModelAndView("home","listMed",listDTO);
	}

}
