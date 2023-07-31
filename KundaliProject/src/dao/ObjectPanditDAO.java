package dao;

import java.util.List;

public interface ObjectPanditDAO{
	public void insertPandit(ObjectPandit pandit); //C
	public ObjectPandit selectPandit(boolean match);//R
	public List<ObjectPandit> selectPandit(); //RA
	public void updatePandit(ObjectPandit pandit); //U
	void deletePandit(boolean match);
}
