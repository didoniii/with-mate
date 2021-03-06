package com.ch.project2.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.project2.model.Board;
import com.ch.project2.model.Category;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSessionTemplate sst;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	
	public List<Category> getCategories() {
		return sst.selectList("boardns.selectCategories");
	}
	public int getBoardCount() {
		return sst.selectOne("boardns.selectBoardCount");
	}
	public int insertBoard(Board board) {
		return sst.insert("boardns.insertBoard", board);
	}
	public Board getBoard(int b_no) {
		return sst.selectOne("boardns.selectBoard", b_no);
	}
	public List<Board> searchBoard(Map<String, Object> param) {
		return sst.selectList("boardns.searchBoard", param);
	}
	public int getSearchBoardCount(Map<String, Object> param) {
		return sst.selectOne("boardns.selectSearchBoardCount", param);
	}
	public int updateBoard(Board board) {
		return sst.update("boardns.updateBoard", board);
	}
	public int getMaxB_no() {
		return sst.selectOne("boardns.selectMaxB_no");
	}
	public int selectTotalMyBoard(String m_id) {
		return sst.selectOne("boardns.selectTotalMyBoard", m_id);
	}
	public List<Board> selectMyBoard(Map<String, Object> param) {
		return sst.selectList("boardns.selectMyBoard", param);
	}
}
