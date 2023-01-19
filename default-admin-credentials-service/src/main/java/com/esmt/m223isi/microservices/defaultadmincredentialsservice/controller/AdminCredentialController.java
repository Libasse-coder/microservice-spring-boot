package com.esmt.m223isi.microservices.defaultadmincredentialsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esmt.m223isi.microservices.defaultadmincredentialsservice.bean.AdminCredential;
import com.esmt.m223isi.microservices.defaultadmincredentialsservice.configuration.Configuration;
import com.esmt.m223isi.microservices.defaultadmincredentialsservice.controller.*;
@RestController
public class AdminCredentialController {
	
	@Autowired
	private Configuration configuration;
	@GetMapping("/admincredential")
	public AdminCredential getAdminCredential() {
		return new AdminCredential(configuration.getLogin(),configuration.getPassword());
		//return new AdminCredential("admin","@bw1n");
	}
}
