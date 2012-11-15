package exceedvote.dao;

import java.util.List;

import exceedvote.domain.Choice;
import exceedvote.domain.Question;

public interface DAO {
	public void save(Object o);
	public List<Question> find();
	public Choice getChoice();
}