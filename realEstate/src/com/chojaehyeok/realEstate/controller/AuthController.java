package com.chojaehyeok.realEstate.controller;

import com.chojaehyeok.realEstate.dto.request.CheckIdRequestDto;
import com.chojaehyeok.realEstate.dto.request.SendCodeRequestDto;
import com.chojaehyeok.realEstate.dto.response.CheckIdResponseDto;
import com.chojaehyeok.realEstate.dto.response.SendCodeResponseDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckIdRequestDto request);
	
	SendCodeResponseDto sendCode(SendCodeRequestDto request);
	
}