package com.spring.pagenation.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.pagenation.dao.ReplyDAO;
import com.spring.pagenation.domain.ReplyVO;

@Service //서비스 클래스임을 명시한다
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;
	
	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.list(bno);
	}

	@Override
	public void write(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
	}

	@Override
	public void modify(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(vo);
	}

	@Override
	public void delete(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(vo);
	}

	@Override
	public ReplyVO replySelect(ReplyVO vo) throws Exception {
		
		return dao.replySelect(vo);
	}

	
}
