package edu.mum.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.repository.RoastRepository;
import edu.mum.service.RoastService;

@Service
public class RoastServiceImpl implements RoastService {
	
	@Autowired
	RoastRepository roastRepository;
	@Override
	public List<String> getAdviceByRoast(String roast) {
		return roastRepository.getAdvice(roast);
	}
	@Override
	public Set<String> getAllRoasts() {
		return roastRepository.getAdviceKeys();
	}

}
