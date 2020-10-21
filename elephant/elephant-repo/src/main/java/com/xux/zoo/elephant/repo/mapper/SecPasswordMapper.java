package com.xux.zoo.elephant.repo.mapper;

import com.xux.zoo.elephant.repo.model.SecPassword;
import java.util.List;

public interface SecPasswordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecPassword record);

    SecPassword selectByPrimaryKey(Integer id);

    List<SecPassword> selectAll();

    int updateByPrimaryKey(SecPassword record);
}