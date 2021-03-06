package com.ch.project2.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.project2.dao.PartiDao;
import com.ch.project2.model.Parti;

@Service
public class PartiServiceImpl implements PartiService {
	@Autowired
	private PartiDao pd;
	
	public List<Parti> ptList(int b_no) {
		return pd.ptList(b_no);
	}
	public List<Parti> ptCancelList(int b_no) {
		return pd.ptCancelList(b_no);
	}
	public int ban(Map<String, Object> ptOut) {
		return  pd.ban(ptOut);
	}
	public int ptCancel(Map<String, Object> ptCancel) {
		return pd.ptCancel(ptCancel);
	}
	public int ptReCancel(Map<String, Object> ptReCancel) {
		return pd.ptReCancel(ptReCancel);
	}
	public int pcAccess(Map<String, Object> pcAccess) {
		return pd.pcAccess(pcAccess);
	}
	public int pcReject(Map<String, Object> pcReject) {
		return pd.pcReject(pcReject);
	}
	public Parti banned(Map<String, Object> param) {
		return pd.banned(param);
	}
	public int selectTotalMyParti(String m_id) {
		return pd.selectTotalMyParti(m_id);
	}
	public List<Parti> selectMyParti(Map<String, Object> param) {
		return pd.selectMyParti(param);
	}
}