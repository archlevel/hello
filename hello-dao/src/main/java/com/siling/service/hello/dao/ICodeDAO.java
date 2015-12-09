package com.siling.service.hello.dao;

import com.tower.service.dao.IDAO;
import com.tower.service.dao.IFKDAO;
import com.tower.service.dao.IIDAO;

import com.siling.service.hello.dao.model.Code;

public interface ICodeDAO<T extends Code> extends IIDAO<T>,IFKDAO<T>,IDAO<T> {

}
