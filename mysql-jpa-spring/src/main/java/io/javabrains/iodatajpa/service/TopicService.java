package io.javabrains.iodatajpa.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.iodatajpa.dto.TopicsDTO;
import io.javabrains.iodatajpa.repository.TopicRepository;
@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	

	public List<TopicsDTO> getAllTopics() {
		// TODO Auto-generated method stub
		List<TopicsDTO> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	public TopicsDTO getTopicById(String id) {
		// TODO Auto-generated method stub
		return topicRepository.findOne(id);
	}
	public void addTopic(TopicsDTO topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
	}
	public void updateTopic(TopicsDTO topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.delete(id);
		
	}

}
