package com.chojaehyeok.realEstate.service;

import com.chojaehyeok.realEstate.dto.request.CheckIdRequestDto;
import com.chojaehyeok.realEstate.dto.request.SendCodeRequestDto;
import com.chojaehyeok.realEstate.dto.response.CheckIdResponseDto;
import com.chojaehyeok.realEstate.dto.response.SendCodeResponseDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckIdRequestDto dto);
	SendCodeResponseDto sendCode(SendCodeRequestDto dto);
}
