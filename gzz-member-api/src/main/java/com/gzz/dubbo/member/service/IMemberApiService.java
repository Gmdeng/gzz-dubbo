package com.gzz.dubbo.member.service;

import com.gzz.dubbo.member.dto.MemberDto;

import java.util.List;

public interface IMemberApiService {
    MemberDto getMember(String no);

    List<MemberDto> getMemberList();

    void save(MemberDto memberDto);
}
