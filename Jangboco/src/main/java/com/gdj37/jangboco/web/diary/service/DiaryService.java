package com.gdj37.jangboco.web.diary.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdj37.jangboco.web.diary.dao.IDiaryDao;
import com.gdj37.jangboco.web.join.dao.IJoinDao;

@Service
public class DiaryService implements IDiaryService{

	@Autowired
	public IDiaryDao iDiaryDao;
	
	@Override
	public int addMember(HashMap<String, String> params) throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.addMember(params);
	}

	@Override
	public int getAllDiaryCnt() throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.getAllDiaryCnt();
	}

	@Override
	public List<HashMap<String, String>> getAllDiaryList(HashMap<String, String> params) throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.getAllDiaryList(params);
	}

	@Override
	public int getSearchDiaryCnt(HashMap<String, String> params) throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.getSearchDiaryCnt(params);
	}

	@Override
	public List<HashMap<String, String>> getSearchDiaryList(HashMap<String, String> params) throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.getSearchDiaryList(params);
	}

	@Override
	public int getLikeDiaryCnt(int member_no) throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.getLikeDiaryCnt(member_no);
	}

	@Override
	public int getMemberNo(String email) throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.getMemberNo(email);
	}

	@Override
	public List<HashMap<String, String>> getLikeDiaryList(HashMap<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.getLikeDiaryList(params);
	}

	@Override
	public int getDiaryPernlCnt(int member_no) throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.getDiaryPernlCnt(member_no);
	}

	@Override
	public List<HashMap<String, String>> getDiaryPernlList(HashMap<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return iDiaryDao.getDiaryPernlList(params);
	}



}
