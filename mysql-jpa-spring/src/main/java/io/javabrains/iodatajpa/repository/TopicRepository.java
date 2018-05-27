package io.javabrains.iodatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.iodatajpa.dto.TopicsDTO;

public interface TopicRepository extends CrudRepository<TopicsDTO, String>{

}
