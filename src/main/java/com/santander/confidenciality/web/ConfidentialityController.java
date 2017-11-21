package com.santander.confidenciality.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.santander.confidenciality.domain.CondifencialityRequest;
import com.santander.confidenciality.domain.OutputTransactionXX0H;
import com.santander.confidenciality.service.EntityService;

@RestController
public class ConfidentialityController {
	
	@Autowired
	private EntityService entityService;
	
	private static final String HEADER_FIELD = "Authorization";

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, value = "/confidenciality",method = {RequestMethod.POST})
	public OutputTransactionXX0H confidenciality(@RequestBody CondifencialityRequest request, @RequestHeader(HEADER_FIELD) String authorization) {
		return entityService.getEntity(request, authorization);
	}
}