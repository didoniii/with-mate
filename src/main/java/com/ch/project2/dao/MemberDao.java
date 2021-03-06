package com.ch.project2.dao;

import com.ch.project2.model.Member;

public interface MemberDao {

	Member selectMember(String m_id);

	Member selectMemberWithNick(String nickname);

	int insert(Member member);

	int updateProfile(Member member);

	int updateMember(Member member);

	int updateRating(Member member);
	
}
