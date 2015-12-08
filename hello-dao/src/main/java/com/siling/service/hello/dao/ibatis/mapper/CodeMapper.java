package com.siling.service.hello.dao.ibatis.mapper;

import java.util.List;
import java.util.Map;

import com.siling.service.hello.dao.model.Code;
import com.tower.service.dao.ibatis.IIMapper;

public interface CodeMapper extends IIMapper<Code>{
 public List<Map> aa(Map params);
}
