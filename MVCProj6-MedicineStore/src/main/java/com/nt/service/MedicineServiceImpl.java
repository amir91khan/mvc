package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.MedicineDetailsBO;
import com.nt.dao.MedicineDAO;
import com.nt.dto.MedicineDetailsDTO;

public class MedicineServiceImpl implements MedicineService {
	private MedicineDAO dao;

	public MedicineServiceImpl(MedicineDAO dao) {
		
		this.dao = dao;
	}

	@Override
	public List<MedicineDetailsDTO> getMedicineDetails() {
		List<MedicineDetailsBO> listBO=null;
		final List<MedicineDetailsDTO> listDTO=new ArrayList();
		
		listBO=dao.retrieveAllMedicines();
		
		listBO.forEach(bo->{
			MedicineDetailsDTO dto=new MedicineDetailsDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		
		return listDTO;
	}

}
