package com.ssafy.service.attraction;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.ssafy.mapper.attraction.AttractionMapper;
import com.ssafy.model.attraction.AttractionInfo;

@Service
public class AttractionServiceImpl implements AttractionService {

	private final AttractionMapper attractionMapper;

	public AttractionServiceImpl(AttractionMapper attractionMapper) {
		this.attractionMapper = attractionMapper;
	}

	@Override
	public List<AttractionInfo> getAttractionsByLocation(int contentTypeId, String sidoName, String gugunName) {
		return attractionMapper.getAttractionsByLocation(contentTypeId, sidoName, gugunName);
	}

	
}
