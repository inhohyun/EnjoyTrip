package com.ssafy.service.attraction;

import java.util.List;

import com.ssafy.model.attraction.AttractionInfo;

public interface AttractionService {

	List<AttractionInfo> getAttractionsByLocation(int contentTypeId, String sidoName, String gugunName);
}
