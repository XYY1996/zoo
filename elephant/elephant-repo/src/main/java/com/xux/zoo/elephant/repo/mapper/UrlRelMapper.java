package com.xux.zoo.elephant.repo.mapper;

import com.xux.zoo.elephant.repo.model.UrlRel;
import java.util.List;

public interface UrlRelMapper {
    int deleteByPrimaryKey(Integer relId);

    int insert(UrlRel record);

    UrlRel selectByPrimaryKey(Integer relId);

    List<UrlRel> selectAll();

    int updateByPrimaryKey(UrlRel record);
}