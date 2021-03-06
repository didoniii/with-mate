package com.ch.project2.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ch.project2.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	@Autowired
	private SqlSessionTemplate sst;
	
	public Member selectMember(String m_id) {
		return sst.selectOne("memberns.selectMember", m_id);
	}
	public Member selectMemberWithNick(String nickname) {
		return sst.selectOne("memberns.selectMemberWithNick", nickname);
	}
	public int insert(Member member) {
		return sst.insert("memberns.insert");
	}
	public int updateProfile(Member member) {
		return sst.update("memberns.updateProfile", member);
	}
	public int updateMember(Member member) {
		return sst.update("memberns.updateMember", member);
	}
	public int updateRating(Member member) {
		return sst.update("memberns.updateRating", member);
	}
	
}
