package com.spring.pagenation.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.pagenation.domain.ReplyVO;


@Repository
public class ReplyDAOImpl implements ReplyDAO {

	@Inject //언제든 컴포넌트를 재사용하기 위해서
	private SqlSession sql;
	
	//mybatis에서 선언한 namespace 선언
	private static String namespace = "com.spring.pagenation.mappers.reply";
	
	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		
		return sql.selectList(namespace+".replyList", bno);
	}

	@Override
	public void write(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace+".replyWrite", vo);		
	}

	@Override
	public void modify(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace+".replyModify", vo);
	}

	@Override
	public void delete(ReplyVO vo) throws Exception {
		sql.delete(namespace+".replyDelete", vo);
		
	}

	@Override
	public ReplyVO replySelect(ReplyVO vo) throws Exception {
		return sql.selectOne(namespace + ".replySelect", vo);
	}

}
