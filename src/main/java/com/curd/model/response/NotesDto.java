package com.curd.model.response;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class NotesDto {

	private Integer id;

	private String title;
	private String description;
	private LocalDate addedDate;
	private LocalDate updatedDate;
}
