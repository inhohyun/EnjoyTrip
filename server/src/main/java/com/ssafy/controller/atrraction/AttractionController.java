package com.ssafy.controller.atrraction;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.model.attraction.AttractionInfo;
import com.ssafy.service.attraction.AttractionService;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("attractions/")
@RestController
public class AttractionController {

	private final AttractionService attractionService;

	public AttractionController(AttractionService attractionService) {
		this.attractionService = attractionService;
	}

	@GetMapping("search")
	public ResponseEntity<Result2<List<AttractionInfo>>> getAttractionsByLocation(
			@RequestParam(value = "contentTypeId", required = false) int contentTypeId,
			@RequestParam(value = "sidoName", required = false) String sidoName,
			@RequestParam(value = "gugunName", required = false) String gugunName) {
		try {
			List<AttractionInfo> findAttractionsByLocation = attractionService.getAttractionsByLocation(contentTypeId,
					sidoName, gugunName);
			Result2<List<AttractionInfo>> result = new Result2<>();
			result.setData(findAttractionsByLocation);
			result.setCount(findAttractionsByLocation.size());

			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			log.error("Attraction search failed", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Data
	@NoArgsConstructor
	static class Result2<T> {
		private T data;
		private int count;
	}
}
