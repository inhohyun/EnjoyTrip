package com.ssafy.mapper.attraction;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.model.attraction.AttractionInfo;

@Mapper
public interface AttractionMapper {

	List<AttractionInfo> getAttractionsByLocation(@Param("contentTypeId") int contentTypeId,
			@Param("sidoName") String sidoName, @Param("gugunName") String gugunName);
}
