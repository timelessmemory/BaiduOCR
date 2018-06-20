package org.ocr.service.impl;

import java.util.HashMap;
import org.ocr.mapper.IUserMapper;
import org.ocr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserMapper mapper;
	
	@Override
	public HashMap check(String name, String code) {
		return mapper.check(name, code);
	}

	@Override
	public boolean isAdd(String code) {
		int c = mapper.isAdd(code);
		if (c > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void add(String name, String code, String gender, String nation, String birth, String address) {
		mapper.add(name, code, gender, nation, birth, address);
	}
}
