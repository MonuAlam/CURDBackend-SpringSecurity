package com.curd.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotesRequest {

	@NotBlank(message = "Title can not be blank")
	private String title;

	@NotBlank(message = "Description can not be blank")
	private String description;

}
