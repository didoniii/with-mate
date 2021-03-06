package com.ch.project2.model;

import lombok.Data;

@Data
public class Rating {
	private int 	r_no;			// 평점 번호
	private String 	m_id; 			// 평가받는 사람 아이디
	private int 	b_no;			// 활동한 게시글 번호
	private Float 	r_score;		// 평점
	private String 	m_id_eval;		// 평가하는 사람 아이디
	
	private String	nickname;		// 평가받는 사람 닉네임
}
