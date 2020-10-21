package com.xux.zoo.elephant.repo.mapper;

import com.xux.zoo.elephant.repo.model.UrlGroup;
import java.util.List;

public interface UrlGroupMapper {
    int deleteByPrimaryKey(Integer groupId);

    int insert(UrlGroup record);

    UrlGroup selectByPrimaryKey(Integer groupId);

    List<UrlGroup> selectAll();

    int updateByPrimaryKey(UrlGroup record);
}