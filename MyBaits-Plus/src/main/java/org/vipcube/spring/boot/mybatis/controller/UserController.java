package org.vipcube.spring.boot.mybatis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.vipcube.spring.boot.mybatis.domain.User;
import org.vipcube.spring.boot.mybatis.service.UserService;

@RestController
@RequestMapping( "/users" )
public class UserController {
	private final UserService service;

	public UserController( UserService service ){
		this.service = service;
	}

	@PostMapping( value = "", consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> addUser( @RequestBody User user ){
		return ResponseEntity.ok( this.service.save( user ) );
	}

	@PutMapping( value = "", consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> updateUserById( @RequestBody User user ){
		return ResponseEntity.ok( this.service.updateById( user ) );
	}

	@DeleteMapping( value = "{id}" )
	public ResponseEntity<?> deleteUserById( @PathVariable long id ){
		return ResponseEntity.ok( this.service.removeById( id ) );
	}

	@GetMapping( value = "", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> selectAll( @RequestParam long page, @RequestParam long size ){
		return ResponseEntity.ok( this.service.page( Page.of( page, size ) ) );
	}

	@GetMapping( value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> selectById( @PathVariable long id ){
		return ResponseEntity.ok( this.service.getById( id ) );
	}

	@GetMapping( value = "/names/{name}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> selectByName( @PathVariable String name ){
		return ResponseEntity.ok( this.service.lambdaQuery()
				.eq( User::getName, name )
				.list() );
	}

	@GetMapping( value = "/left-join-logs/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> selectLeftJoinLogs( @PathVariable long id ){
		return ResponseEntity.ok( this.service.selectLeftJoinLogs( id ) );
	}
}
