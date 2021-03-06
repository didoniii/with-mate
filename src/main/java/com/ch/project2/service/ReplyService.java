package com.ch.project2.service;

import java.util.List;

import com.ch.project2.model.Reply;

public interface ReplyService {
	
	// 댓글리스트
	List<Reply> getReplyList(int b_no); 	
	
	//신규 댓글 입력
	int insertReply(Reply reply);
	
	//다음 댓글 번호 구하기
	int selectReplyCount();
	
	//re_step 구하기
	int selectReStep(int re_ref);
	
	//댓글 원 주인 찾기
	String selectReplyMaster(int re_ref);
	
	//댓글 삭제
	int delete(int re_no);

}
