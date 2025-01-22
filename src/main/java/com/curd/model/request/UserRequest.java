package com.curd.model.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequest {

	private String email;
	private String password;
	private String name;
	private String phone;
}
