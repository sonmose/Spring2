package com.gura.spring002.member.dao;

import java.util.List;

import com.gura.spring002.member.dto.MemberDto;

public interface MemberDao {
/*
 *  의존 관계를 느슨하게 하귀 위해 Dao 클래스가 구현할
*/
	public List<MemberDto> getList();
	public void insert(MemberDto dto);
	public void delete(int num);
	public MemberDto getData(int num);
	public void update(MemberDto dto);
}
