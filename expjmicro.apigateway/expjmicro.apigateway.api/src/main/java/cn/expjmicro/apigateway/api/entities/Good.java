package cn.expjmicro.apigateway.api.entities;

import cn.jmicro.api.annotation.SO;
import lombok.Data;

@Data
@SO
public class Good {

	private long id;
	private String name;
	private double price;
	
	private int total;
	
	private int usableCnt;
	
}
