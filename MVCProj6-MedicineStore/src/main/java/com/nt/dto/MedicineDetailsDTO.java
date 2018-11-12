package com.nt.dto;

import lombok.Data;

@Data
public class MedicineDetailsDTO {
	private int medId;
	private String medName;
	private String formulaeName;
	private float price;
	private String company;

}
