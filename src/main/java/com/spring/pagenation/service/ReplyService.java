package com.spring.pagenation.service;

import java.util.List;

import com.spring.pagenation.domain.ReplyVO;

public interface ReplyService {

	//댓글 조회
	public List<ReplyVO> list(int bno) throws Exception;
	//댓글 쓰기
	public void write(ReplyVO vo) throws Exception;
	//댓글 수정
	public void modify(ReplyVO vo) throws Exception;
	//댓글 삭제
	public void delete(ReplyVO vo) throws Exception;
	//댓글 한개 조회
	public ReplyVO replySelect(ReplyVO vo) throws Exception;
}
