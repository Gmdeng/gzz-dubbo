package com.gzz.dubbo.member.service.dubboapi;

import com.gzz.dubbo.member.domain.Member;
import com.gzz.dubbo.member.service.IMemberService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service
public class MemberApiService implements IMemberService {


    @Override
    public Member getMember(String no) {
        return null;
    }

    @Override
    public List<Member> getMemberList() {
        return null;
    }
}
