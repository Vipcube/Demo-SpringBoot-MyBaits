package org.vipcube.spring.boot.mybatis.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vipcube.spring.boot.mybatis.domain.Log;
import org.vipcube.spring.boot.mybatis.service.LogService;

@RestController
@RequestMapping( "/logs" )
public class LogController {
	private final LogService service;

	public LogController( LogService service ){
		this.service = service;
	}

	@PostMapping( value = "", consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> addUser( @RequestBody Log log ){
		return ResponseEntity.ok( this.service.save( log ) );
	}

	@GetMapping( value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> selectById( @PathVariable long id ){
		return ResponseEntity.ok( this.service.getById( id ) );
	}
}
