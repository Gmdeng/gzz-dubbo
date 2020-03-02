package com.gzz.dubbo.member.service;

import com.gzz.dubbo.member.domain.Member;

import java.util.List;

public interface IMemberService {
    Member getMember(String no);

    List<Member> getMemberList();
}
