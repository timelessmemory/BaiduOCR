package org.ocr.service;

import java.util.HashMap;


public interface IUserService {
	public HashMap check(String name, String code);
	public boolean isAdd(String code);
	public void add(String name, String code, String gender, String nation, String birth, String address);
}
