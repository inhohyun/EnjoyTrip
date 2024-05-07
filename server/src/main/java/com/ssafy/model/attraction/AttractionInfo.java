package com.ssafy.model.attraction;

import lombok.Data;

@Data
public class AttractionInfo {
	 private Integer id;
	    private Integer contentTypeId;
	    private String title;
	    private String addr1;
	    private String addr2;
	    private String zipcode;
	    private String tel;
	    private String firstImage;
	    private String firstImage2;
	    private Integer readCount;
	    private Sido sido;
	    private Gugun gugun;
	    private Double latitude;
	    private Double longitude;
	    private String mlevel;
}
