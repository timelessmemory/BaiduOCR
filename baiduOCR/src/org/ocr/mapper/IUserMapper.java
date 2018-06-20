package org.ocr.mapper;

import java.util.HashMap;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserMapper {
	public HashMap check(@Param("name")String name, @Param("code")String code);
	public int isAdd(@Param("code")String code);
	public void add(@Param("name")String name, @Param("code")String code, @Param("gender")String gender, @Param("nation")String nation, @Param("birth")String birth, @Param("address")String address);
}
