package com.vc.urlencrypter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vc.urlencrypter.objectmodel.UrlDC;

@RestController
public class UrlEncrypterController {
	
	private static final Logger LOG = LoggerFactory.getLogger(UrlEncrypterController.class);

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String encryptUrl(
			@RequestBody UrlDC urlDC) {
		LOG.info(urlDC.toString());
		urlDC.setPassword(new String(Base64Utils.decodeFromString(urlDC.getPassword())));
		LOG.info(urlDC.toString());
		String encoded = Base64Utils.encodeToString(urlDC.toString().getBytes());
		LOG.info(encoded);
		return encoded;
	}
	
	
}