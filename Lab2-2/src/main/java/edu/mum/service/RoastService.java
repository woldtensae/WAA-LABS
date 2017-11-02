package edu.mum.service;

import java.util.List;
import java.util.Set;




public interface RoastService {
	public List<String> getAdviceByRoast(String roast);
	public Set<String> getAllRoasts();
}
