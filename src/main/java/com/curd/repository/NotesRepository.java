package com.curd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.model.entity.Notes;
import com.curd.model.response.NotesDto;

public interface NotesRepository extends JpaRepository<Notes, Integer> {

	List<NotesDto> findByUserId(Integer id);

}
