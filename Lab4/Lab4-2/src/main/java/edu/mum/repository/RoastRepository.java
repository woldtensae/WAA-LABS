package edu.mum.repository;


import java.util.List;
import java.util.Set;

public interface RoastRepository {
	public List<String> getAdvice(String roast);
	public Set<String> getAdviceKeys();
}
