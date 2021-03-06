package com.ch.project2.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.project2.model.Parti;

@Repository
public class PartiDaoImpl implements PartiDao {
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<Parti> ptList(int b_no) {
		return sst.selectList("partins.ptList", b_no);
	}
	public List<Parti> ptCancelList(int b_no) {
		return sst.selectList("partins.ptCancelList",b_no);
	}
	public int ban(Map<String, Object> ptOut) {
		return sst.update("partins.ban",ptOut);
	}
	public int ptCancel(Map<String, Object> ptCancel) {
		return sst.update("partins.ptCancel",ptCancel);
	}
	public int ptReCancel(Map<String, Object> ptReCancel) {
		return sst.update("partins.ptReCancel",ptReCancel);
	}
	public int pcAccess(Map<String, Object> pcAccess) {
		return sst.update("partins.pcAccess",pcAccess);
	}
	public int pcReject(Map<String, Object> pcReject) {
		return sst.update("partins.pcReject",pcReject);
	}
	public Parti banned(Map<String, Object> param) {
		return sst.selectOne("partins.banned", param);
	}
	public int selectTotalMyParti(String m_id) {
		return sst.selectOne("partins.selectTotalMyParti", m_id);
	}
	public List<Parti> selectMyParti(Map<String, Object> param) {
		return sst.selectList("partins.selectMyParti", param);
	}
}
