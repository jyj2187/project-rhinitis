package com.rhinitis.projectrhinitis.user.service;

import com.rhinitis.projectrhinitis.user.dto.MemberDto;

public interface MemberService {
    MemberDto.Response joinMember(MemberDto.Join joinDto);
    MemberDto.Response loginMember(MemberDto.Login loginDto);
    MemberDto.Response activateMember(Long memberId, MemberDto.Activate activateDto);
    MemberDto.Response updateMember(Long memberId, MemberDto.Patch patchDto);
    MemberDto.Response getMember(Long memberId);
    void deactivateMember(Long memberId);
}
